package com.hcorp.themesoflegends.service;


import com.hcorp.themesoflegends.dto.MusicDto;
import com.hcorp.themesoflegends.entity.Music;
import com.hcorp.themesoflegends.repositopry.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    private final MusicRepository musicRepository;

    @Autowired
    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public List<MusicDto> getAllMusics() {
        return this.musicRepository.findAll().stream()
                .map(this::convertToDto)
                .toList();
    }

    public MusicDto getRandomMusic() {
        List<Music> musics = this.musicRepository.findAll();
        return this.convertToDto(musics.get((int) (Math.random() * musics.size())));
    }

    public MusicDto findMusic(String musicId) {
        return this.musicRepository.findByUid(musicId).map(this::convertToDto).orElse(null);
    }

    private MusicDto convertToDto(Music music) {
        return MusicDto.builder()
                .id(music.getUid())
                .name(music.getName())
                .date(music.getDate())
                .type(music.getType())
                .aliases(music.getAliases())
                .build();
    }
}
