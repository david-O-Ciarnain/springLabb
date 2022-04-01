package com.example.inlammningprojekt.controller;

import com.example.inlammningprojekt.dto.DTOAlbumResponse;
import com.example.inlammningprojekt.dto.DTOConverter;
import com.example.inlammningprojekt.entity.Album;
import com.example.inlammningprojekt.service.AlbumService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/album")
public class AlbumController {

    final
    AlbumService albumService;
    DTOConverter dtoConverter;

    public AlbumController(AlbumService albumService, DTOConverter dtoConverter) {
        this.albumService = albumService;
        this.dtoConverter = dtoConverter;
    }

    @GetMapping
    public String getAllStuff(Model model) {
        List<DTOAlbumResponse> albumList = albumService.getAll()
                .stream()
                .map(album -> dtoConverter.DTOEntityToAlbumResponse(album))
                .toList();
        model.addAttribute("albumList", albumList);
        return "album";
    }

    @GetMapping("/{id}")
    public Album getById(@PathVariable("id") int id) {
        return albumService.getById(id);
    }

    @PostMapping
    public String post(@ModelAttribute Album album) {
        albumService.post(album);
        return "redirect:/album";
    }

    @GetMapping("/addalbum")
    public String addAlbum() {
        return "newAlbumForm";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStuff(@PathVariable("id") int id) {

        albumService.deleteById(id);

        return ResponseEntity.status(303).header("Location", "/album").build();

 /*   @PutMapping("/{id}")
    public Album update(@PathVariable("id") int id, @RequestBody Album album) {
        return albumService.updateById(id, album);
  */
    }

}