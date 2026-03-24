package com.example.glyrics.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongDto {
    private String artist;
    private String title;
    private String lyrics;
    private String youtubeUrl;
    private String mp3Url;
    private String spotifyUrl;
}
