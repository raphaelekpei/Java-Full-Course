package com.raphael.file_handling.creating_files;

import java.io.File;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {

        try {
            File file = new File("templates", "file.txt");
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File file2 = new File("templates/file2.html");
            if (!file2.exists()) file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
