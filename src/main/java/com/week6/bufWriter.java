package com.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("variables.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        int intData = 43;
        double dblData = 987.654;
        String strData = "Java";

        bufWriter.write(intData + "\r\n");
        bufWriter.write(dblData + "\r\n");
        bufWriter.write(strData + "\r\n");
        bufWriter.newLine();

        bufWriter.write("Integer: " + Integer.toString(intData));
        bufWriter.newLine();

        bufWriter.write("Double: " + Double.toString(123.456));

        bufWriter.close();

    }
} 