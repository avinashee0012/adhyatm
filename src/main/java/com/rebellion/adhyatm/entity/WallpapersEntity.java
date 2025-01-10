package com.rebellion.adhyatm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wallpapers")
@Data
public class WallpapersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wallpaper;
    private String content;
    private String god;
    private String relatedwallpapers;
    private String relatedlyrics;
    private String bestfit;
    private Long downloads;

}
