package com.week8;

/**
 * Created by sz8386pr on 10/10/2017.
 */
public class LP extends Album {

    private int condition; //1 = barely playable, 5 = mint

    public LP(String artist, String title, int condition, double price) {
        this.artist = artist;
        this.title = title;
        this.condition = condition;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Format = LP, Artist = " + artist + ", Title = " + title + ", " +
                "Condition = " + condition + ", Price $" + price;
    }
} 