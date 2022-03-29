package com.example.inlammningprojekt;

import com.example.inlammningprojekt.entity.Album;
import com.example.inlammningprojekt.repository.AlbumRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InlammningprojektApplication  {

    final
    AlbumRepo albumRepo;

    public InlammningprojektApplication(AlbumRepo albumRepo) {
        this.albumRepo = albumRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(InlammningprojektApplication.class, args);
    }

@Bean
    CommandLineRunner init(AlbumRepo albumRepo){
        return args -> {
            Album album = new Album("Batman","1914-05-12",60,"BatmanVSSuperman", "/Batman.jpeg");
            Album album2 = new Album("Superman","1914-05-12",60,"SupermanVSBatman", "/superman.jpeg");
            Album album3 = new Album("Catwoman","1904-05-12",540,"Catwoman<3Batman", "/catwoman.jpg");
            albumRepo.save(album);
            albumRepo.save(album2);
            albumRepo.save(album3);
        };
}

}
