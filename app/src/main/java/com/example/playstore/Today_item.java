package com.example.playstore;

public class Today_item {
    private int imageResource;
    private String short_text;
    private String long_text;
    private String discription_text;

    public Today_item(int imageResource, String short_text, String long_text, String discription_text) {
        this.imageResource = imageResource;
        this.short_text = short_text;
        this.long_text = long_text;
        this.discription_text = discription_text;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getShort_text() {
        return short_text;
    }

    public String getLong_text() {
        return long_text;
    }

    public String getDiscription_text() {
        return discription_text;
    }
}
