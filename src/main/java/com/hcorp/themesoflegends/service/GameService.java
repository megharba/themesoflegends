package com.hcorp.themesoflegends.service;

import com.hcorp.themesoflegends.dto.GameDto;
import com.hcorp.themesoflegends.dto.MusicDto;
import com.hcorp.themesoflegends.dto.PlayerDto;
import com.hcorp.themesoflegends.dto.PlayerResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GameService {

    private final MusicService musicService;
    //TODO MOCK BDD
    private final List<GameDto> games;

    @Autowired
    public GameService(MusicService musicService) {
        this.musicService = musicService;
        this.games = new ArrayList<>();
    }

    public GameDto createNewGame(String player, int roundToPlay) {
        GameDto game = GameDto.builder()
                .gameId(UUID.randomUUID().toString())
                .player(PlayerDto.builder()
                        .name(player)
                        .score(0)
                        .combo(0)
                        .mastery("")
                        .build())
                .roundToPlay(roundToPlay)
                .round(0)
                .musicPlayed(new ArrayList<>())
                .build();
        this.games.add(game);
        return game;
    }

    public boolean deleteGame(String gameId) {
        Optional<GameDto> optionalGame = this.findGame(gameId);
        if (optionalGame.isPresent()) {
            this.games.remove(optionalGame.get());
            return true;
        }
        return false;
    }

    public MusicDto getRoundMusic(String gameId) {
        Optional<GameDto> optionalGame = this.findGame(gameId);
        if (optionalGame.isPresent()) {
            GameDto game = optionalGame.get();
            MusicDto music;
            do {
                music = musicService.getRandomMusic();
            } while (game.getMusicPlayed().contains(music));

            game.getMusicPlayed().add(music);
            return music;
        }
        return null;
    }

    public GameDto treatPlayerResponse(String gameId, PlayerResponseDto playerResponse) {
        Optional<GameDto> optionalGame = this.findGame(gameId);
        Optional<MusicDto> optionalMusic = this.musicService.findMusic(playerResponse.getMusicId());
        if (optionalGame.isPresent() && optionalMusic.isPresent()) {
            GameDto game = optionalGame.get();
            MusicDto music = optionalMusic.get();

            //points management
            int pointCounter = 0;
            int comboCounter = 0;
            if (playerResponse.getDate().equals(music.getDate())) {
                pointCounter += 50;
                comboCounter += 1;
            }
            if (playerResponse.getType().equals(music.getType())) {
                pointCounter += 100;
                comboCounter += 1;
            }
            if (playerResponse.getProposition().toLowerCase().equals(music.getName())) {
                pointCounter += 150;
                comboCounter += 1;
            } else if (music.getAliases().contains(playerResponse.getProposition().toLowerCase())) {
                pointCounter += 100;
            }

            //combo management
            if (comboCounter == 3 && game.getPlayer().getCombo() < 5) {
                game.getPlayer().setCombo(Math.min(game.getPlayer().getCombo() + 1, 5));
            }
            if (comboCounter == 1) {
                game.getPlayer().setCombo(Math.max(game.getPlayer().getCombo() - 1, 0));
            }
            if (comboCounter == 0) {
                game.getPlayer().setCombo(0);
            }

            //player update
            game.getPlayer().setScore(game.getPlayer().getScore() + (int) (pointCounter + (pointCounter * game.getPlayer().getCombo() * 0.2)));

            //round management
            game.setRound(game.getRound() + 1);
            if (game.getRound() == game.getRoundToPlay()) {
                game.setOver(true);

                //mastery management
                int maxPoint = this.getMaxScore(game.getRoundToPlay());
                if (game.getPlayer().getScore() > maxPoint * 0.85) {
                    game.getPlayer().setMastery("M7");
                } else if (game.getPlayer().getScore() > maxPoint * 0.70) {
                    game.getPlayer().setMastery("M6");
                } else if (game.getPlayer().getScore() > maxPoint * 0.55) {
                    game.getPlayer().setMastery("M5");
                } else if (game.getPlayer().getScore() > maxPoint * 0.40) {
                    game.getPlayer().setMastery("M4");
                } else if (game.getPlayer().getScore() > maxPoint * 0.25) {
                    game.getPlayer().setMastery("M3");
                } else if (game.getPlayer().getScore() > maxPoint * 0.10) {
                    game.getPlayer().setMastery("M2");
                } else {
                    game.getPlayer().setMastery("M1");
                }

                this.games.remove(game);
            }
            return game;
        }
        return null;
    }

    private Optional<GameDto> findGame(String gameId) {
        return this.games.stream()
                .filter(gameDto -> gameId.equals(gameDto.getGameId()))
                .findFirst();
    }

    private int getMaxScore(int roundToPlay) {
        int points = 0;
        int combo = 0;

        for (int i = 0; i < roundToPlay; i++) {
            points += (int) (300 * (1 + 0.2 * Math.min(combo, 5)));
            combo++;
        }

        return points;
    }
}
