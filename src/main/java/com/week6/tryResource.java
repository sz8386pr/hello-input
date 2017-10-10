package com.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class tryResource {
    public static void main(String[] args) {
        String filename = "myfile.txt";

        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter(filename))) {
            bufWriter.write("Some example data\n");
            bufWriter.write("Some more example\n");
            bufWriter.close();
        }

        catch (IOException ioe) {
            System.out.println("Could not open or write to " + filename);
            System.out.println(ioe.toString());
            System.out.println("This code automatically closed the BufferedWriter and FileWriter"
            + "in the event of an IOException");
            System.out.println("Can do more error handling here, if needed");
        }
    }
} 