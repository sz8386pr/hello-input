package com.week8;

import java.util.StringTokenizer;

/**
 * Created by sz8386pr on 10/10/2017.
 */
public class Album {

    protected String artist;
    protected String title;
    protected double price;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}