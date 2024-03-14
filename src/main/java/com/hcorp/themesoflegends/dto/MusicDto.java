package com.hcorp.themesoflegends.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MusicDto {
    private String id;
    private String name;
    private String date;
    private String type;
    private List<String> aliases;
}
