package com.mil.en2fr.recycleviewdemo;

public class DataModel {
   private int image;
   private String name;
   private String mobilno;

    public DataModel(int image, String name, String mobilno) {
        this.image = image;
        this.name = name;
        this.mobilno = mobilno;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilno() {
        return mobilno;
    }

    public void setMobilno(String mobilno) {
        this.mobilno = mobilno;
    }
}
