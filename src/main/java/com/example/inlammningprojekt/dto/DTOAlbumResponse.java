package com.example.inlammningprojekt.dto;

public class DTOAlbumResponse {

    private int id;
    private String songName;
    private String artistName;
    private String release;
    private String songLength;

    public DTOAlbumResponse(int id, String songName, String artistName, String release, int songLength) {
        this.id = id;
        this.songName = "Låtnamn: " + songName;
        this.artistName = "Artistnamn: " + artistName;
        this.release = "Releasedatum: " + release;
        this.songLength = "Låtlängd: " + songLength;
    }

    public DTOAlbumResponse() {

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
}
