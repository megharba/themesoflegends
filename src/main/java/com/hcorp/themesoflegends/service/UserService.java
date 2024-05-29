package com.hcorp.themesoflegends.service;

import com.hcorp.themesoflegends.dto.UserDto;
import com.hcorp.themesoflegends.entity.User;
import com.hcorp.themesoflegends.repositopry.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final HighScoreService highScoreService;

    @Autowired
    public UserService(UserRepository userRepository, HighScoreService highScoreService) {
        this.userRepository = userRepository;
        this.highScoreService = highScoreService;
    }

    public UserDto createUser(String userName, String email, String userPassword) {
        if (this.userRepository.findByName(userName).isEmpty()) {
            User newUser = User.builder()
                    .name(userName)
                    .uid(UUID.randomUUID().toString())
                    .email(email)
                    .avatarToken("default")
                    .password(userPassword)
                    .gamePlayed(0L)
                    .totalScore(0L)
                    .build();
            newUser.setHighScore(this.highScoreService.createHighScore(newUser));
            return this.convertToDto(this.userRepository.save(newUser));
        }
        return null;
    }

    public UserDto connectUser(String userName, String userPassword) {
        Optional<User> user = this.userRepository.findByName(userName);
        if (user.isPresent() && userPassword.equals(user.get().getPassword())) {
            return this.convertToDto(user.get());
        }
        return null;
    }

    public UserDto findUserByUid(String userUid) {
        Optional<User> user = this.userRepository.findByUid(userUid);
        return user.map(this::convertToDto).orElse(null);
    }

    public UserDto updateAvatar(String userUid, String newAvatar) {
        Optional<User> optionalUser = this.userRepository.findByUid(userUid);
        if(optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setAvatarToken(newAvatar);
            return this.convertToDto(this.userRepository.save(user));
        }
        return null;
    }

    public UserDto updatePassword(String userUid, String newPassword) {
        Optional<User> optionalUser = this.userRepository.findByUid(userUid);
        if(optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setPassword(newPassword);
            return this.convertToDto(this.userRepository.save(user));
        }
        return null;
    }

    public void updateScore(String userUid, int score, String mastery, int roundPlayed) {
        Optional<User> optionalUser = this.userRepository.findByUid(userUid);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setGamePlayed(user.getGamePlayed() + 1);
            user.setTotalScore(user.getTotalScore() + score);
            user.getHighScore().forEach(highScoreDto -> {
                if (highScoreDto.getRoundNumber() == roundPlayed && highScoreDto.getHighScoreValue() < score) {
                    highScoreDto.setHighScoreValue((long) score);
                    highScoreDto.setMastery(mastery);
                }
            });
            this.userRepository.save(user);
        }
    }

    private UserDto convertToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .uid(user.getUid())
                .avatarToken(user.getAvatarToken())
                .email(user.getEmail())
                .gamePlayed(user.getGamePlayed())
                .highScore(user.getHighScore().stream()
                        .map(this.highScoreService::convertToDto)
                        .toList())
                .totalScore(user.getTotalScore())
                .build();
    }
}
