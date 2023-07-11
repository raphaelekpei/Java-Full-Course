package com.raphael.file_handling.file_manipulation;

import java.io.*;
import java.util.Scanner;

public class FileManipulation {

    public static File createFile(String pathName){

        try {
            File file = new File(pathName);
            if (!file.exists()) file.createNewFile();
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    public static void writeToFile(File file, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file, append); // fileWriter accepts the file that we want to write to, & append
            PrintWriter writer = new PrintWriter(fileWriter); // PrintWriter allows us to write to the file. It takes the fileWriter as a parameter
            writer.println("Hello");
            writer.println("World");
            writer.flush();    // to flush the contents into the file
            writer.close();    // to close the PrintWriter
        } catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    public static void readFromFile(File file){
        try {
            Scanner scanner = new Scanner(file);
            if (scanner.hasNext()) System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void deleteFile(File file) {
         if (file.exists())file.delete();
    }
}
