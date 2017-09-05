package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
import static input.InputUtils.*;

public class secretNumber {
    public static void main(String[] args) {

        int secretNumber = 5;
        int userNumber = intInput("Guess the number between 1 to 10");

        while ( userNumber != secretNumber ) {
            if (secretNumber > userNumber) {
                System.out.println("Your guess needs to be higher");
            }
            else if (secretNumber < userNumber) {
                System.out.println("Your guess needs to be lower");

            }
            userNumber = intInput("Guess the number between 1 to 10");
        }

        System.out.println("You have guessed it right! The secret number is " + secretNumber +"!!!");

    }
}
