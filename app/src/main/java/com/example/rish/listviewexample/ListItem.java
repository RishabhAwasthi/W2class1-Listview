package com.example.rish.listviewexample;

public class ListItem {
    String name;
    String quantity;
    int image;
    public ListItem(String name, String quantity, int image) {
        this.name = name;
        this.quantity = quantity;
        this.image = image;
    }
    public ListItem()
    {}

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public int getImage() {
        return image;
    }
}
