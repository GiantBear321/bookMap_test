package org.example;

import java.io.File;

public class Main {
    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");

        String filePath = currentDirectory + File.separator + INPUT_FILE_NAME;

        TxtFileReader reader = new TxtFileReader();
        String[] process = reader.process(filePath);

        TxtFileWriter txtFileWriter = new TxtFileWriter();
        txtFileWriter.createOutput(process);
    }
}