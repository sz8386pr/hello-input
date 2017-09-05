package com.week3;

import static input.InputUtils.*;
/**
 * Created by sz8386pr on 9/5/2017.
 */
public class tripMPG {
    public static void main(String[] args) {
        double milesDriven = doubleInput("How many miles have you driven?");
        double gasUsed = doubleInput("How many gallons of gas have you used?");
        double tripMPG = calcMPG(milesDriven, gasUsed);
        System.out.println(String.format ("Your trip's MPG is %.2f", tripMPG));
    }

    public static double calcMPG(double milesDriven, double gasUsed) {
        return milesDriven / gasUsed;
    }
}
