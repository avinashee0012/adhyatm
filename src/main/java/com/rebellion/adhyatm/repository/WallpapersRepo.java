package com.rebellion.bhaktigallery.repository;
import com.rebellion.bhaktigallery.entity.WallpapersEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallpapersRepo extends JpaRepository<WallpapersEntity, Long> {
}
