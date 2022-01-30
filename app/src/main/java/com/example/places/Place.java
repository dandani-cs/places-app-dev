package com.example.places;

public class Place {
    private String name;

    private int    image_id; // Drawable ID
    private String description;

    public Place(String name, int image_id, String description) {
        this.name = name;
        this.image_id = image_id;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
