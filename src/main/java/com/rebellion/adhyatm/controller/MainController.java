package com.rebellion.bhaktigallery.controller;

import com.rebellion.bhaktigallery.service.LyricsService;
import com.rebellion.bhaktigallery.service.WallpapersService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("")
public class MainController {

    private final LyricsService lyricsService;
    private final WallpapersService wallpapersService;

    public MainController(LyricsService lyricsService, WallpapersService wallpapersService) {
        this.lyricsService = lyricsService;
        this.wallpapersService = wallpapersService;
    }

    @GetMapping("")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("about")
    public String getAboutPage() {
        return "about-us";
    }

    @GetMapping("career")
    public String getCareerPage() {
        return "career";
    }

    @GetMapping("contact")
    public String getContactPage() {
        return "contact-us";
    }

    @GetMapping("top-5-wallpapers")
    public String getTop5WallpapersPage() {
        return "top-5-wallpapers";
    }

    @GetMapping("top-5-lyrics")
    public String getTop5LyricsPage() {
        return "top-5-lyrics";
    }
    

    @GetMapping("lyrics")
    public ModelAndView viewLyricsPage(ModelAndView modelAndView) {
        modelAndView.addObject("alllyrics", lyricsService.getAllLyrics());
        modelAndView.setViewName("lyrics-list");
        return modelAndView;
    }

    @GetMapping("lyrics/{id}")
    public ModelAndView viewLyricsByIdPage(ModelAndView modelAndView, @PathVariable Long id) {
        modelAndView.addObject("lyrics", lyricsService.getLyrics(id));
        modelAndView.setViewName("lyrics");
        return modelAndView;
    }

    @GetMapping("wallpapers")
    public ModelAndView viewWallpapersPage(ModelAndView modelAndView) {
        modelAndView.addObject("allwallpapers", wallpapersService.getAllWallpapers());
        modelAndView.setViewName("wallpapers-list");
        return modelAndView;
    }

    @GetMapping("wallpapers/{id}")
    public ModelAndView viewWallpaperByIdPage(ModelAndView modelAndView, @PathVariable Long id) {
        modelAndView.addObject("wallpapers", wallpapersService.getWallpapers(id));
        modelAndView.setViewName("wallpapers");
        return modelAndView;
    }

    
}