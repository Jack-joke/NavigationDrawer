package com.example.dell.recyclerview_demo;

import android.media.Image;

public class Human {
    private String mName;
    private int mImage;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public Human() {
    }

    public Human(String mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }
}
