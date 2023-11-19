package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class TxtFileReader {

    public String[] process(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] firstLine = reader.readLine().trim().split("\\s");
            int n = Integer.parseInt(firstLine[0]);
            int q = Integer.parseInt(firstLine[1]);
            char[] charArray = new char[n];

            for (int i = 0; i < n; i++) {
                int currentChar = reader.read();
                char character = (char) currentChar;

                charArray[i] = character;
            }

            reader.readLine();

            StringMatcher matcher = new StringMatcher();
            String[] resultArray = new String[q];
            for (int i = 0; i < q; i++) {
                String[] queryParts = reader.readLine().trim().split("\\s");
                int l = Integer.parseInt(queryParts[0]);
                int r = Integer.parseInt(queryParts[1]);
                int k = Integer.parseInt(queryParts[2]);

                resultArray[i] = matcher.stringMatcher(l, r, k ,charArray);
            }

            return resultArray;

        } catch (Exception e) {
            throw new RuntimeException("Can't read from file input.txt " + filePath, e);
        }
    }
}
