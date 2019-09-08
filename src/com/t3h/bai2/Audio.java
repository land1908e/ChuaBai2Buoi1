package com.t3h.bai2;

public abstract class Audio {
    String name;
    String type; //the loai
    int duration;// thoi luong
    String quality;

    abstract void play();//phuong thuc truu tuong

    void showInfo(){
        System.out.println("name: " + name);
        System.out.println("type: " + type);
        System.out.println("duration: " + duration);
        System.out.println("quality: " + quality);
    }


}
