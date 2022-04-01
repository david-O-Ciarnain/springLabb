package com.example.inlammningprojekt.repository;

import com.example.inlammningprojekt.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<Song,Integer> {
}
