package com.example.inlammningprojekt.dto;

public class DTOSongRequest {

    private final String imageSource;
    private final String songName;
    private final String artistName;
    private final String release;
    private final String songLength;

    public DTOSongRequest(String songName, String artistName, String release, String songLength, String imageSource) {
        this.songName = songName;
        this.artistName = artistName;
        this.release = release;
        this.songLength = songLength;
        this.imageSource = imageSource;
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
        return Integer.parseInt(songLength);
    }

    public String getImageSource() {return imageSource;}
}
