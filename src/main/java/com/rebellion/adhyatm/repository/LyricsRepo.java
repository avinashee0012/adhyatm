package com.rebellion.adhyatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rebellion.adhyatm.entity.LyricsEntity;

@Repository
public interface LyricsRepo extends JpaRepository<LyricsEntity, Long> {
}
