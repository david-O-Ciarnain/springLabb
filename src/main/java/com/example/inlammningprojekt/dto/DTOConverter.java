package com.example.inlammningprojekt.dto;

import com.example.inlammningprojekt.entity.Song;
import org.springframework.stereotype.Service;

@Service
public class DTOConverter {

    public Song songRequestDTOToEntity(DTOSongRequest dtoSongRequest) {
        return new Song(
                dtoSongRequest.getSongName(),
                dtoSongRequest.getArtistName(),
                dtoSongRequest.getSongLength(),
                dtoSongRequest.getRelease(),
                dtoSongRequest.getImageSource()
        );
    }

    public DTOSongResponse DTOEntityToSongResponse(Song song) {
        return new DTOSongResponse(
                song.getId(),
                song.getSongName(),
                song.getArtistName(),
                song.getRelease(),
                song.getSongLength(),
                song.getImageSource()
        );
    }

}
