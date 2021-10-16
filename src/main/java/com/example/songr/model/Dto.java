package com.example.songr.model;

public class Dto {
    private String title;
    private int length;
    private int tracNumber;
    private  String album;

    public Dto() {
    }

    public Dto(String title, int length, int tracNumber, String album) {
        this.title = title;
        this.length = length;
        this.tracNumber = tracNumber;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTracNumber() {
        return tracNumber;
    }

    public void setTracNumber(int tracNumber) {
        this.tracNumber = tracNumber;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
