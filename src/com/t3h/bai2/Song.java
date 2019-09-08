package com.t3h.bai2;

public class Song extends Audio {
    String artis;//ten ca si
    String album;

    @Override//do laf phthuc truu tuong leen can dinh nghia lai_ ghi de
    void play() {
        System.out.println(" play song");
    }

    @Override//fo
    void showInfo() {
        super.showInfo();//goi phuong thuc cua cha
        System.out.println("artis: " + artis);
        System.out.println("album: " + album);
    }
}
