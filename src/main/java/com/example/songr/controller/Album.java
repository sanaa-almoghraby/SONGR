package com.example.songr.controller;

import com.example.songr.Repository.AlbumRepository;
import com.example.songr.Repository.SongRepository;
import com.example.songr.model.AlbumModel;
import com.example.songr.model.Dto;
import com.example.songr.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Album {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private SongRepository songRepository;


    @GetMapping("/album")
    public String getAlbum(Model model,Model model2) {
        AlbumModel album1 = new AlbumModel("Mahkama" , "Kazem Al-saher" ,12, 2880 , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDV4Xnex5Rm5ovgZ6VAgNIAmFrL25XjQdNEg&usqp=CAU" );
        AlbumModel album2 = new AlbumModel("Dari Ya Alby" , "hamza namira" ,10, 2500 , "https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg" );
        AlbumModel album3 = new AlbumModel("The Centre" , "Sami Yusuf" ,13, 2950 , "https://play.samaanetwork.net/wp-content/uploads/edd/2018/12/cover.jpg" );
        List<AlbumModel> albumList = new ArrayList<>();
        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        model.addAttribute("Albums" , albumList);
        model2.addAttribute("AlbumModel",albumRepository.findAll());
        return "album";
    }
//    @PostMapping("/song")
//    public RedirectView createNewBlogPost(@ModelAttribute Dto dto) { // modelattribute when working with form data
//        AlbumModel album=albumRepository.findAlbumByTitle(dto.getAlbum()).;
//        Song newSong = new Song(dto.getTitle(), (int) dto.getLength(), dto.getTracNumber(), album);
//        songRepository.save(newSong);
//
//        return new RedirectView("song");
//    }
}
