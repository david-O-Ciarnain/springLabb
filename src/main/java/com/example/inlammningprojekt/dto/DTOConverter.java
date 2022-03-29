package com.example.inlammningprojekt.dto;

import com.example.inlammningprojekt.entity.Album;
import org.springframework.stereotype.Service;

@Service
public class DTOConverter {

    public Album albumRequestDTOToEntity(DTOAlbumRequest dtoAlbumRequest) {
        return new Album(
                dtoAlbumRequest.getSongName(),
                dtoAlbumRequest.getArtistName(),
                dtoAlbumRequest.getSongLength(),
                dtoAlbumRequest.getRelease()
        );
    }

    public DTOAlbumResponse DTOEntityToAlbumResponse(Album album) {
        return new DTOAlbumResponse(
                album.getId(),
                album.getSongName(),
                album.getArtistName(),
                album.getRelease(),
                album.getSongLength()
        );
    }

}
