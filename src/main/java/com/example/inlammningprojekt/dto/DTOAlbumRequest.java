package com.example.inlammningprojekt.dto;

public class DTOAlbumRequest {

    private String songName;
    private String artistName;
    private String release;
    private int songLength;

    public DTOAlbumRequest(String songName, String artistName, String release, int songLength) {
        this.songName = songName;
        this.artistName = artistName;
        this.release = release;
        this.songLength = songLength;
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

    public int getSongLength() {
        return songLength;
    }
}
