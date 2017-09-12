package com.week4;

import java.util.ArrayList;

public class myClasses {
    public static void main(String[] args) {

        ArrayList myClasses = new ArrayList();

        myClasses.add("PC Hardware");
        myClasses.add("Java Programming");
        myClasses.add("MySQL");

        myClasses.remove("Java Programming");

        if (myClasses.size() == 0) {
            System.out.println("myClasses ArrayList is empty!");
        }
        else {
            for (Object ob : myClasses) {
                System.out.println(ob);
            }
        }
    }
}
