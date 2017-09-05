package com.week3;

/**
 * Created by sz8386pr on 9/5/2017.
 */
public class MPG {
    public static void main(String[] args) {

        double m = 1.0;
        int week = 1;

        while (m < 26.2) {
            m *= 1.1;
            System.out.println (String.format("In week %d, you need to run %.2f miles", week, m));
            week++;
        }

        System.out.println(week);

    }
}
