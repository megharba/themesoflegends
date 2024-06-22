package com.hcorp.themesoflegends.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class RankHighScoreDto {
    String userName;
    String uid;
    HighScoreDto highScore;
}
