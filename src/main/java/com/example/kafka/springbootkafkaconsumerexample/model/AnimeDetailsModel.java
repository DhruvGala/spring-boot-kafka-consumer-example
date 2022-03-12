package com.example.kafka.springbootkafkaconsumerexample.model;

public class AnimeDetailsModel {
    private String name;
    private String rating;

    public AnimeDetailsModel() {
    }

    public AnimeDetailsModel(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
