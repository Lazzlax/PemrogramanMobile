package com.andrean.lazzlax.gudangresepmama;

/**
 * Created by LazzLax on 10/12/2017.
 */

public class DesignItem {
    private int img;
    private String judul;
    private String desc;

    public DesignItem(int img, String judul, String desc) {
        this.img = img;
        this.judul = judul;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getDesc() {
        return desc;
    }
}
