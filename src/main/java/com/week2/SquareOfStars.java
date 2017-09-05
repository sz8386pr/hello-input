package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
import static input.InputUtils.*;

public class SquareOfStars {
    public static void main(String[] args) {
        int squareSize = intInput("Enter the size of the square");
        String squareCharacter = stringInput("Enter the character(s) to display a square with");

        // Display a square of *
        // The outer loop prints one row per loop repeat
        for (int x = 0; x < squareSize ; x++) {

            // Inner for loop. For each row, print a star 5 times
            for (int y = 0; y < squareSize; y++) {
                System.out.print(squareCharacter);
            }
            System.out.println();
        }
    }
}
