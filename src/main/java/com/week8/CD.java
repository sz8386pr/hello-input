package com.week8;

/**
 * Created by sz8386pr on 10/10/2017.
 */
public class CD extends Album{

    public CD(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Format = CD, Artist = " + artist + ", Title = " + title + ", Price $" + price;
    }
} 