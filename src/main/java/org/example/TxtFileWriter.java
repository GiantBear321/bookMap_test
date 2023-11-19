package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriter {
    private static final String FILE_NAME = "output.txt";

    public void createOutput(String[] resultArray) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter((FILE_NAME)))) {
            for (String line : resultArray) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Cant write to file");
        }
    }
}
