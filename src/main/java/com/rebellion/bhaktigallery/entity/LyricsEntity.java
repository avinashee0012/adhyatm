package com.rebellion.bhaktigallery.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "lyrics")
@Data
public class LyricsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String song;
    private String content;
    private String god;
    private String relatedwallpapers;
    private String relatedlyrics;
}
