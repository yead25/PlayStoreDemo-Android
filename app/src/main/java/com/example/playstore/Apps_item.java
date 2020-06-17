package com.example.playstore;

public class Apps_item {
    private int appImage;
    private String appName;
    private int appSize;

    public Apps_item(int appImage, String appName, int appSize) {
        this.appImage = appImage;
        this.appName = appName;
        this.appSize = appSize;
    }

    public int getAppImage() {
        return appImage;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }
}
