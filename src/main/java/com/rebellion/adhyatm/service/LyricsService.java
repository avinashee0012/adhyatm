package com.rebellion.adhyatm.service;

import org.springframework.stereotype.Service;

import com.rebellion.adhyatm.entity.LyricsEntity;
import com.rebellion.adhyatm.repository.LyricsRepo;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LyricsService {

    private final LyricsRepo lyricsRepo;

    public LyricsService(LyricsRepo lyricsRepo) {
        this.lyricsRepo = lyricsRepo;
    }

    public void saveLyrics(LyricsEntity obj){
        lyricsRepo.save(obj);
    }

    public LyricsEntity getLyrics(Long id){
        LyricsEntity lyricsEntity = lyricsRepo.findById(id).orElseThrow(() -> new NoSuchElementException("Lyrics not found"));
        return lyricsEntity;
    }

    public List<LyricsEntity> getAllLyrics(){
        List<LyricsEntity> lyricsEntity = lyricsRepo.findAll();
        return lyricsEntity;
    }
}
