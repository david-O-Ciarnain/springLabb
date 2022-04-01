package com.example.inlammningprojekt;

import com.example.inlammningprojekt.entity.Song;
import com.example.inlammningprojekt.repository.SongRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InlammningprojektApplication  {

    final
    SongRepo songRepo;

    public InlammningprojektApplication(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(InlammningprojektApplication.class, args);
    }

@Bean
    CommandLineRunner init(SongRepo songRepo){
        return args -> {
            Song song = new Song("Batman","1914-05-12",60,"BatmanVSSuperman", "/Batman.jpeg");
            Song song2 = new Song("Superman","1914-05-12",60,"SupermanVSBatman", "/superman.jpeg");
            Song song3 = new Song("Catwoman","1904-05-12",540,"Catwoman<3Batman", "/catwoman.jpg");
            songRepo.save(song);
            songRepo.save(song2);
            songRepo.save(song3);
        };
}

}
