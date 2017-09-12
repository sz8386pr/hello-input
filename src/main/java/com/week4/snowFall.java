package com.week4;

import java.util.HashMap;
import static input.InputUtils.*;

public class snowFall {

    public static void main(String[] args) {

        double totalSnowfall = 0;

        HashMap<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.0);
        snowfall.put("February", 10.0);
        snowfall.put("March", 4.0);
        snowfall.put("April", 0.0);

        String newMonth = stringInput("Name of the month");
        snowfall.put(newMonth, doubleInput("Snowfall in " + newMonth));

        if (snowfall.containsKey(newMonth)) {
            System.out.println("You already have the data for " + newMonth + ". It will be overwritten!");
        }

        Object janSnowFall = snowfall.get("January");
        System.out.println("In January, " + janSnowFall + " inches of snow fell");

        for (Object ob: snowfall.keySet()) {
            System.out.println("Month: " + ob);
            System.out.println("Snowfall inches " + snowfall.get(ob));
            totalSnowfall += snowfall.get(ob);
        }

        System.out.println(totalSnowfall);


    }
}
