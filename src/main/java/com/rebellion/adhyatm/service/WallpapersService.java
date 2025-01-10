package com.rebellion.adhyatm.service;
import org.springframework.stereotype.Service;

import com.rebellion.adhyatm.entity.WallpapersEntity;
import com.rebellion.adhyatm.repository.WallpapersRepo;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class WallpapersService {

    private final WallpapersRepo wallpapersRepo;

    public WallpapersService(WallpapersRepo wallpapersRepo) {
        this.wallpapersRepo = wallpapersRepo;
    }

    public void saveWallpapers(WallpapersEntity obj){
        wallpapersRepo.save(obj);
    }

    public WallpapersEntity getWallpapers(Long id){
        WallpapersEntity wallpapersEntity = wallpapersRepo.findById(id).orElseThrow(() -> new NoSuchElementException("Wallpapers not found"));
        return wallpapersEntity;
    }

    public List<WallpapersEntity> getAllWallpapers(){
        List<WallpapersEntity> wallpapersEntity = wallpapersRepo.findAll();
        return wallpapersEntity;
    }
}
