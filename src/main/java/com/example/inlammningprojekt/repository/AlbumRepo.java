package com.example.inlammningprojekt.repository;

import com.example.inlammningprojekt.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<Album,Integer> {
}
