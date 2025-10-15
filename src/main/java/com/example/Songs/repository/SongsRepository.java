package com.example.Songs.repository;

import com.example.Songs.model.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongsRepository extends JpaRepository<Songs, Long> {
    // Get all songs where type = "Trending Songs"
    List<Songs> findByType(String type);
}
