package com.abedsako.smoothrecyclerview_example;

public class List_Data {
    String Image;
    String name;

    public List_Data(String name, String image) {
        this.name = name;
        this.Image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }
}
