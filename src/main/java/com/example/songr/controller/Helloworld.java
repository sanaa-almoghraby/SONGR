package com.example.songr.controller;

import com.example.songr.Repository.AlbumRepository;
import com.example.songr.Repository.SongRepository;
import com.example.songr.model.AlbumModel;
import com.example.songr.model.Dto;
import com.example.songr.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Helloworld {
    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private SongRepository songRepository;

    @ResponseBody
    @PostMapping("/albums")
    public RedirectView createNewalbum(@ModelAttribute AlbumModel album, Model model) {
        model.addAttribute("album", album);
        albumRepository.save(album);
        return new RedirectView("albums");
    }

    @GetMapping("/albums")
    public String getAlbums(Model model) {
        model.addAttribute("albums", albumRepository.findAll());
        return "album";
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "Hello";
    }

    @GetMapping("/capitalize/{text}")
    public String setCapitalize(Model model, @PathVariable String text) {
        String capitalizeText = text.toUpperCase();
        model.addAttribute("Text", capitalizeText);
        return "Capitalize";
    }

    @PostMapping("/album")
    public RedirectView createAlbum(@ModelAttribute AlbumModel album) {
        albumRepository.save(album);
        return new RedirectView("album");


    }

    @GetMapping("/select")
    public String getSelect() {
        return "select";
    }

    @PostMapping("/song")
    public RedirectView createNewBlogPost(@ModelAttribute Dto dto) { // modelattribute when working with form data
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + dto.getAlbum());
        AlbumModel album = albumRepository.findAlbumModelByTitle(dto.getAlbum()).orElseThrow();
        Song newSong = new Song(dto.getTitle(), (int) dto.getLength(), dto.getTracNumber(), album);
        songRepository.save(newSong);

        return new RedirectView("song");
    }
    @GetMapping("/song")
    public String getSongs(Model model) {
        model.addAttribute("songs", songRepository.findAll());
        return "song";
    }
    @GetMapping("/albums/{album}")
    public String findOneAlbum(@PathVariable String album, Model model) {
        AlbumModel oneAlbum = albumRepository.findAlbumModelByTitle(album).orElseThrow();
        model.addAttribute("album", oneAlbum);

        return "oneAlbum";
    }
}