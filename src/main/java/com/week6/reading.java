package com.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class reading {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("variables.txt");
        BufferedReader bufReader = new BufferedReader(reader);

        String line = bufReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();

        }

        bufReader.close();

        System.out.println("\n");


        // Alternative way of using buffered reader using one line for BufferedReader

        BufferedReader bufReader2 = new BufferedReader(new FileReader("name.txt"));
        line = bufReader2.readLine();
        ArrayList<String> allLines = new ArrayList<String>();

        while (line != null) {
            System.out.println(line);
            allLines.add(line);
            line = bufReader2.readLine();

        }

        bufReader2.close();
    }
}