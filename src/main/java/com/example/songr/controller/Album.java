package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import com.example.songr.model.albumModel;

@Controller
public class Album {


    @GetMapping("/album")
    public String getAlbum(Model model) {
        albumModel album1 = new albumModel("Mahkama" , "Kazem Al-saher" ,12, 2880 , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDV4Xnex5Rm5ovgZ6VAgNIAmFrL25XjQdNEg&usqp=CAU" );
        albumModel album2 = new albumModel("Dari Ya Alby" , "hamza namira" ,10, 2500 , "https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg" );
        albumModel album3 = new albumModel("The Centre" , "Sami Yusuf" ,13, 2950 , "https://play.samaanetwork.net/wp-content/uploads/edd/2018/12/cover.jpg" );
        List<albumModel> albumList = new ArrayList<>();
        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        model.addAttribute("Albums" , albumList);
        return "album.html";
    }

}
