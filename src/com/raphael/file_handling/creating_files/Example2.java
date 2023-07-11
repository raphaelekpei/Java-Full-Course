package com.raphael.file_handling.creating_files;

import java.io.File;
import java.io.IOException;


public class Example2 {

    public static File createFile1(String path, String fileName) {

        try {
            File file = new File(path, fileName);
            if(!file.exists()) file.createNewFile();
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    public static File createFile2(String pathName){

        try {
            File file = new File(pathName);
            if(!file.exists()) file.createNewFile();
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

}
