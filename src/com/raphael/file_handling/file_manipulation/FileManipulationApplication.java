package com.raphael.file_handling.file_manipulation;

import java.io.File;

public class FileManipulationApplication {
    public static void main(String[] args) {

        FileManipulation.createFile("");
        FileManipulation.writeToFile(new File(""), true);
        FileManipulation.readFromFile(new File(""));
        FileManipulation.deleteFile(new File(""));
    }
}
