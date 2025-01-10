package com.rebellion.adhyatm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rebellion.adhyatm.entity.WallpapersEntity;

@Repository
public interface WallpapersRepo extends JpaRepository<WallpapersEntity, Long> {
}
