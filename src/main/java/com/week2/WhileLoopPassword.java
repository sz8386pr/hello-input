package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
import static input.InputUtils.*;

public class WhileLoopPassword {
    public static void main(String[] args) {

        String secretPassword = "kittens";
        int numberOfTries = 0;
        int lockoutNumber = 5;
        boolean access = true;

        System.out.println();
        String userPassword = stringInput("Enter the password");

        while (!userPassword.equals(secretPassword)) {
            numberOfTries++;
            if (numberOfTries == lockoutNumber - 1) {
                System.out.println("Last chance before you will be locked out!");
            }
            else if (numberOfTries == lockoutNumber) {
                System.out.println("You have tried to enter the password too many times." +
                        "\nYou have been locked out.");
                access = false;
                break;
            }

            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
        }

        if (access) {
                System.out.println("Correct password - access granted");
        }
    }
}

