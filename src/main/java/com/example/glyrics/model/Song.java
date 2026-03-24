package com.example.glyrics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80, unique = true, nullable = false)
    private String artist;

    @Column(length = 200, unique = true, nullable = false)
    private String title;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String lyrics;

    @Column(length = 250)
    private String youtubeUrl;

    @Column(length = 250)
    private String mp3Url;

    @Column(length = 250)
    private String spotifyUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
