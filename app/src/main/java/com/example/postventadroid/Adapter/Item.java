package com.example.postventadroid.Adapter;


public class Item {

    private String itemDescription;
    private String urlImage;

    public Item(String itemDescription, String urlImage) {
        this.itemDescription = itemDescription;
        this.urlImage = urlImage;
    }

    public Item(String edificio_almendro, String s, String s1, String s2, String s3) {
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}

