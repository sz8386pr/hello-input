package com.week4;

import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {

        LinkedList<String> stack = new LinkedList<>();

        stack.push("www.google.com");
        stack.push("www.minneapolis.edu");
        stack.push("www.youtube.com");
        stack.push("www.github.com");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
