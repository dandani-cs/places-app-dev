package com.example.places;

public class Place {
    private int placeImage;
    private String placeName;
    private String placeDescription;

    public Place(int placeImage, String placeName, String placeDescription) {
        this.placeImage = placeImage;
        this.placeName = placeName;
        this.placeDescription = placeDescription;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }
}
