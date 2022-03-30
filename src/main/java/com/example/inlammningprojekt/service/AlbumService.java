package com.example.inlammningprojekt.service;

import com.example.inlammningprojekt.entity.Album;
import com.example.inlammningprojekt.repository.AlbumRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    final
    AlbumRepo albumRepo;

    public AlbumService(AlbumRepo albumRepo) {
        this.albumRepo = albumRepo;
    }

    public List<Album> getAll() {
        return albumRepo.findAll();
    }

    public Album getById(int id) {
        return albumRepo.findById(id).orElseThrow();
    }

    public Album post(Album album) {
        return albumRepo.save(album);
    }

    public void deleteById(int id) {
         albumRepo.deleteById(id);
    }

    public Album updateById(int id, Album album) {

        Album exAlbum = albumRepo.findById(id).orElseThrow();

        if(album.getSongName()!=null){
            exAlbum.setSongName(album.getSongName());
        }
        if(album.getArtistName()!=null){
            exAlbum.setArtistName(album.getArtistName());
        }
        if(album.getRelease()!=null){
            exAlbum.setRelease(album.getRelease());
        }
        if(album.getSongLength() > 0){
            exAlbum.setSongLength(album.getSongLength());
        }

         albumRepo.save(exAlbum);
        return exAlbum;





    }

    public void save(Album album) {
        return;
    }
}
