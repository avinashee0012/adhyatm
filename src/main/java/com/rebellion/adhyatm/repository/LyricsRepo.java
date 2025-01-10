package com.rebellion.bhaktigallery.repository;

import com.rebellion.bhaktigallery.entity.LyricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LyricsRepo extends JpaRepository<LyricsEntity, Long> {
}
