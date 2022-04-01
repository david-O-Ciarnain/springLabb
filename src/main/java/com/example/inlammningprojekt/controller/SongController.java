package com.example.inlammningprojekt.controller;

import com.example.inlammningprojekt.dto.DTOSongRequest;
import com.example.inlammningprojekt.dto.DTOSongResponse;
import com.example.inlammningprojekt.dto.DTOConverter;
import com.example.inlammningprojekt.entity.Song;
import com.example.inlammningprojekt.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {

    final
    SongService songService;
    DTOConverter dtoConverter;

    public SongController(SongService songService, DTOConverter dtoConverter) {
        this.songService = songService;
        this.dtoConverter = dtoConverter;
    }

    @GetMapping
    public String getAllStuff(Model model) {
        List<DTOSongResponse> songList = songService.getAll()
                .stream()
                .map(song -> dtoConverter.DTOEntityToSongResponse(song))
                .toList();
        model.addAttribute("songList", songList);
        return "song";
    }

    @GetMapping("/{id}")
    public Song getById(@PathVariable("id") int id) {
        return songService.getById(id);
    }

    @PostMapping
    public String post(@ModelAttribute DTOSongRequest dtoSongRequest) {
        Song incomingSong = dtoConverter.songRequestDTOToEntity(dtoSongRequest);
        songService.post(incomingSong);
        return "redirect:/song";
    }

    @GetMapping("/addsong")
    public String addAlbum() {
        return "newSongForm";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStuff(@PathVariable("id") int id) {

        songService.deleteById(id);

        return ResponseEntity.status(303).header("Location", "/song").build();

 /*   @PutMapping("/{id}")
    public Song update(@PathVariable("id") int id, @RequestBody Song album) {

        return albumService.updateById(id, album);


  */
    }

}