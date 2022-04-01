package com.example.inlammningprojekt.dto;

public class DTOSongResponse {

    private String imageSource;
    private int id;
    private String songName;
    private String artistName;
    private String release;
    private String songLength;

    public DTOSongResponse(int id, String songName, String artistName, String release, int songLength, String imageSource) {
        this.id = id;
        this.songName = "Song name: " + songName;
        this.artistName = "Artist namn: " + artistName;
        this.release = "Release date: " + release;
        this.songLength = "Song length: " + songLength;
        this.imageSource = imageSource;
    }

    public DTOSongResponse() {

    }

    public int getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getRelease() {
        return release;
    }

    public String getSongLength() {
        return songLength;
    }

    public String getImageSource() {return imageSource;}
}
