package com.example.inlammningprojekt.controller;

import com.example.inlammningprojekt.entity.Album;
import com.example.inlammningprojekt.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/album")
public class AlbumController {

    final
    AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<Album> getAllStuff() {
        return albumService.getAll();
    }

    @GetMapping("/{id}")
    public Album getById(@PathVariable("id") int id) {
        return albumService.getById(id);
    }

    @PostMapping
    public Album post(@RequestBody Album album) {
        return albumService.post(album);
    }

    @DeleteMapping("/{id}")
    public void deleteStuff(@PathVariable("id") int id) {
        albumService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Album update(@PathVariable("id") int id, @RequestBody Album album) {

        return albumService.updateById(id, album);

    }
}
