package com.week8;

import java.util.ArrayList;
import java.util.Scanner;

import static input.InputUtils.stringInput;

/**
 * Created by sz8386pr on 10/10/2017.
 */
public class RecordStore {
    public static void main(String[] args) {
        ArrayList <CD> cdInventory = new ArrayList<>();
        CD testCD1 = new CD("Beyonce", "Lemonade", 9.99);
        CD testCD2 = new CD("Bob Dylan", "Basement Tapes", 6.99);

        cdInventory.add(testCD1);
        cdInventory.add(testCD2);

        ArrayList<LP> lpInventory = new ArrayList<>();
        LP testLP1 = new LP("Michael Jackson", "Thriller", 4, 9.99);
        LP testLP2 = new LP("Replacements", "Hootenanny", 3, 7.99);

        lpInventory.add(testLP1);
        lpInventory.add(testLP2);

        System.out.println("All LPs in the inventory: ");
        for (LP lp: lpInventory) {
            System.out.println(lp);
        }

        System.out.println("All CDs in the inventory: ");
        for (CD cd: cdInventory) {
            System.out.println(cd);
        }


        ArrayList<Album> allInventory = new ArrayList<>();
        allInventory.addAll(lpInventory);
        allInventory.addAll(cdInventory);

        String searchString = stringInput("Enter artist or title to search for. Works for partial artists/titles.");
        searchForAlbum(allInventory, searchString);
    }

    private static void searchForAlbum(ArrayList<Album> albums, String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        boolean found = false;
        for (Album a : albums) {
            if (a.getTitle().toLowerCase().contains(searchTerm) || a.getArtist().toLowerCase().contains(searchTerm)) {
                found = true;
                System.out.println(a);
            }
        }

        if (!found) {
            System.out.println("No matching albums found that match " + searchTerm);
        }

    }
} 