package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
public class OilChange {
    public static void main(String[] args) {

        int mileage = 50000;
        int oilChangeIncrement = 3000;
        System.out.println("Change your engine oil at");

        //Change the oil every oilChangeIncrement miles for the next 8 times
        for (int x = 0; x < 8; x++) {
            mileage = mileage + oilChangeIncrement;
            System.out.println(mileage + " miles");
        }
    }
}
