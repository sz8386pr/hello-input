package com.week4;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        // Add to the list
        myList.add("Hello");
        myList.add(6);
        myList.add("Java");
        myList.add("Python");
        //myList.add("C#");

        // Add to the position 2, BUT removes "Hello" with the next line, so it moves up.
        myList.add(2, "Third one?");

        myList.add((myList.size()/2 + 1), "Middle");

        // Remove from the list
        Object removed = myList.remove(0);
        System.out.println(removed + " was removed\n");


        // Create the Object ob
        Object ob = myList.get(1);
        System.out.println(ob);

        // Print the whole list
        System.out.println(myList);

        // For each loop
        for (Object obj: myList) {
            System.out.println(obj);
        }

        // Traditional for loop
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }


}
