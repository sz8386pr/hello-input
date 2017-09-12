package com.week4;

import java.util.ArrayList;

public class sum {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        // numberList.add("not integer"); // Won't work because it's not an integer

        int sum = 0;

        for (Integer number: numberList) {
            sum += number;
        }

        System.out.println("The sum is " + sum);


        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String3");

        for (String item: stringList) {
            item = item.toUpperCase();
            System.out.println(item);
        }

        for (int x = 0; x < stringList.size(); x++) {
            String item = stringList.get(x);
            String upperCase = item.toUpperCase();
            stringList.set(x, upperCase);
        }

        System.out.println(stringList);
    }
}
