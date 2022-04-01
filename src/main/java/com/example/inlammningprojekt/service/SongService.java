package com.example.inlammningprojekt.service;

import com.example.inlammningprojekt.entity.Song;
import com.example.inlammningprojekt.repository.SongRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    final
    SongRepo songRepo;

    public SongService(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    public List<Song> getAll() {
        return songRepo.findAll();
    }

    public Song getById(int id) {
        return songRepo.findById(id).orElseThrow();
    }

    public Song post(Song song) {
        return songRepo.save(song);
    }

    public void deleteById(int id) {
        songRepo.deleteById(id);
    }

    public Song updateById(int id, Song song) {

        Song exSong = songRepo.findById(id).orElseThrow();

        if (song.getSongName() != null) {
            exSong.setSongName(song.getSongName());
        }
        if (song.getArtistName() != null) {
            exSong.setArtistName(song.getArtistName());
        }
        if (song.getRelease() != null) {
            exSong.setRelease(song.getRelease());
        }
        if (song.getSongLength() > 0) {
            exSong.setSongLength(song.getSongLength());
        }

        songRepo.save(exSong);
        return exSong;
    }

    /*public void save(Song album) {
        return;
    }*/
}
