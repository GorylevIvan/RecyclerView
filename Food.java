package com.example.recyclerview;

public class Food {
    private String name;
    private int picture;
    public Food(String name, int picture){

        this.name=name;
        this.picture=picture;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return this.picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
