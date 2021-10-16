package com.example.songr.model;

import com.example.songr.controller.Album;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    private String title;
    private int length;
    private int trackNumber;


    @ManyToOne()
    @JoinColumn(name = "album_id")
    private AlbumModel album;

    public Song(){

    }

    public Song(String title, int length, int trackNumber, AlbumModel album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public AlbumModel getAlbum() {
        return album;
    }

    public void setAlbum(AlbumModel album) {
        this.album = album;
    }

    public Long getId() {
        return id;
    }


}
