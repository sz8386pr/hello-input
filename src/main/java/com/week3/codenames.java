package com.week3;

/**
 * Created by sz8386pr on 9/5/2017.
 */
public class codenames {
    public static void main(String[] args) {

        String[] filenames = {"random.py", "assignment.doc", "report.pdf", "math.c", "airfares.xls", "main.java", "computing.java", "blah.java"};
        String[] extensions = {".java", ".c", ".py"};

        for (String f : filenames) {
            for (String e : extensions) {
                if (f.endsWith(e)) {
                    System.out.println(f);
                }
            }
        }
    }
}
