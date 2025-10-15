package com.example.Songs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Songs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String songname;
    private String artist;
    private String image_name;
    private String year;
    private String time;
    private String totalsongs;
    private String date;
    private String new_entries;


    public Songs() {}

    public Songs(String type, String songname, String artist, String image_name, String year, String time, String totalsongs, String date, String new_entries) {
        this.type = type;
        this.songname = songname;
        this.artist = artist;
        this.image_name = image_name;
        this.year = year;
        this.time = time;
        this.totalsongs = totalsongs;
        this.date = date;
        this.new_entries = new_entries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTotalSongs() {
        return totalsongs;
    }

    public void setTotalSongs(String totalSongs) {
        totalsongs = totalSongs;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNew_entries() {
        return new_entries;
    }

    public void setNew_entries(String new_entries) {
        this.new_entries = new_entries;
    }
}
