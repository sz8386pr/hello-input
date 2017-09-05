package com.week1;

import static input.InputUtils.*;

public class Distance {
    public static void main(String[] args) {

        double mile = doubleInput("What is the distance between your home and MCTC in miles?");

        double kilometer = mile * 1.6;

        System.out.println("The distance between your home and MCTC is " + kilometer + " km");

        // Displays the message depends on whether the user lives farther than 10 miles away from MCTC
        if (mile > 10) {
            System.out.println("You live more than 10 miles from MCTC");
        }
        else if (mile == 10) {
            System.out.println("You live exactly 10 miles from MCTC");
        }
        else {
            System.out.println("You live less than 10 miles from MCTC");
        }
    }
}
