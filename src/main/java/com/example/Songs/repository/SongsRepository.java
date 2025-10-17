package com.example.Songs.repository;

import com.example.Songs.model.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins = "*")
public interface SongsRepository extends JpaRepository<Songs, Long> {
    // Get all songs where type = "Trending Songs"
    List<Songs> findByType(String type);
}
