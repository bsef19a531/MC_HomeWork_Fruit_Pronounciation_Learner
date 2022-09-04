package com.example.fruitpronounciationlearner;

public class ListItem {
    private  String Name;
    private  int Image;

    public ListItem(String name, int image) {
        this.Name = name;
        this.Image = image;
    }

    public String getName() {
        return Name;
    }

    public int getImage() {
        return Image;
    }
    public void setName(String name)
    {
        this.Name = name;
    }

    public void setImage(int image) {
        this.Image = image;
    }
}
