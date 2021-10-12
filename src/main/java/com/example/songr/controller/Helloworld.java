package com.example.songr.controller;

import com.example.songr.Repository.AlbumRepository;
import com.example.songr.Repository.SongRepository;
import com.example.songr.model.AlbumModel;
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

    @ResponseBody
    @PostMapping("/albums")
    public RedirectView createNewalbum(@ModelAttribute AlbumModel album, Model model) {
        model.addAttribute("album",album);
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

}
