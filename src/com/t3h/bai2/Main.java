package com.t3h.bai2;

public class Main {
    public static void main(String[] args) {
        Song song = new Song();//song la 1 contro hay 1 bien
        song.name = "Name 1";
        updateName(song);
        System.out.println(song.name);

    }
    public static void updateName(Song testSong){
        testSong.name = "test";
    }

}
