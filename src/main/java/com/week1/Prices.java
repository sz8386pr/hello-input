package com.week1;

import static input.InputUtils.*;

public class Prices {

    public static void main(String[] args) {

        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");

        // Calculate the total price
        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" + price
                + " each costs a total of $" + totalPrice);

    }
}
