package com.week3;

import  static input.InputUtils.stringInput;
/**
 * Created by sz8386pr on 9/5/2017.
 */
public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    private static String makeGreeting(String n) {
        return "Hello " + n + "!";
    }
}
