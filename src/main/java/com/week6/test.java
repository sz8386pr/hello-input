package com.week6;

import java.io.BufferedWriter;
import static input.InputUtils.*;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        String name = stringInput("Enter your name");

        String filename = "name.txt";

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename));

        fileWriter.write (name + "\n");
        fileWriter.write("Java Programming");
        fileWriter.newLine ();
        fileWriter.write("Today is Tuesday." + "\n");
        fileWriter.close();

        System.out.println("Your name has been written to " + filename);
    }



}
