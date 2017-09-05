package com.week2;

/**
 * Created by sz8386pr on 8/29/2017.
 */
import static input.InputUtils.*;

public class AverageTestScoreSimpleLoop {
    public static void main(String[] args) {

        //Calculate the average of 5 test scores

        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        for (int test = 1; test <= numberOfTests ; test++) {
            testScore = doubleInput("Enter test score #" + test);
            testScoreSum = testScoreSum + testScore;
        }

        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
    }
}
