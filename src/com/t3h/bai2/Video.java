package com.t3h.bai2;

public class Video extends Audio {
    String product;

    @Override
    void play() {
        System.out.println(" play video");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("product: " + product);
    }
}
