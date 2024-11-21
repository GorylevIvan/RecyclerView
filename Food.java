package com.example.recyclerview;

public class Food {
    private String name;
    private int picture;
    public Food(String name, int flag){

        this.name=name;
        this.picture=flag;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagResource() {
        return this.picture;
    }

    public void setFlagResource(int flagResource) {
        this.picture = flagResource;
    }
}
