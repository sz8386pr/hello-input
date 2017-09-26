package com.week4;

import java.util.ArrayList;
import static input.InputUtils.*;

public class textBook {
    public static void main(String[] args) {

        ArrayList<Double> textBookCost = new ArrayList<>();

        int numberOfTextBook = intInput("Number of textbook?");
        double total = 0;

        for (int x = 0; x < numberOfTextBook; x++) {
            textBookCost.add(doubleInput("Textbook price for the book #" + (x+1)));
            total += textBookCost.get(x);
        }

        System.out.println("The total of the textbook price is $" + total);
        System.out.println("The average cost for the textbook is $" + (total/textBookCost.size()));
    }
}