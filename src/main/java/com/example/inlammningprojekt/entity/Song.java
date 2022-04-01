package com.example.inlammningprojekt.entity;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String songName;

    @Column(nullable = false)
    private String release;

    @Column(nullable = false)
    private int songLength;

    @Column(nullable = false)
    private String artistName;

    @Column
    private String imageSource;

    public Song(String songName, String release, int songLength, String artistName, String imageSource) {
        this.songName = songName;
        this.release = release;
        this.songLength = songLength;
        this.artistName = artistName;
        this.imageSource = imageSource;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }


    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
}
