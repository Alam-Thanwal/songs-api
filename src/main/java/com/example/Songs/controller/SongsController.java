package com.example.Songs.controller;

import com.example.Songs.model.Songs;
import com.example.Songs.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/songs")
public class SongsController {

    @Autowired
    private SongsRepository songsRepository;

    @GetMapping
    public List<Songs> getAllSongs() {
        return songsRepository.findAll();
    }

    @PostMapping
    public Songs addSong(@RequestBody Songs song) {
        return songsRepository.save(song);
    }
    // ✅ Fetch songs by type (e.g., Trending Songs or Popular albums)
    @GetMapping("/type/{type}")
    public List<Songs> getSongsByType(@PathVariable String type) {
        return songsRepository.findByType(type);
    }

}
