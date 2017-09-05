package com.week1;

import static input.InputUtils.*;

public class Temp {

    public static void main(String[] args) {

        String currentMonth = stringInput("What is the current month?");

        int day = intInput("What is today's date?");

        double highTemp = doubleInput("What is today's high temp?");

        double lowTemp = doubleInput("What is today's low temp?");

        double tempDiff = highTemp - lowTemp;

        System.out.println("Today, " + currentMonth + " " + day + ", the difference between" +
                " the high and the low temperatures is " + tempDiff + "F");
    }
}
