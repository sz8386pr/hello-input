package com.week6;

import java.io.*;

public class bufWriteRead {
    public static void main(String[] args) throws IOException{

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("temp.txt"));

        bufWriter.newLine();
        bufWriter.write("Scott");
        bufWriter.newLine();
        bufWriter.write("Blue");
        bufWriter.newLine();
        bufWriter.write("2545");

        bufWriter.close();

        BufferedReader bufReader = new BufferedReader(new FileReader("temp.txt"));
        String line = bufReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();
        }

        bufReader.close();

    }
} 