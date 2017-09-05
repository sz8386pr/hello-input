package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
public class NASARocket {
    public static void main(String[] args) {

        System.out.println("NASA rocket launch countdown!");
        for (int x = 10; x >= 0; x--) {

            System.out.println(x);
            if (x == 0) {
                System.out.println("LAUNCH!!!");
            }
        }

    }
}
