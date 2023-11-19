package org.example;

public class StringMatcher {
    private static final int NO_MATCH = -1;

    public String stringMatcher(int start, int end, int targetIndex, char[] chars) {
        int countA = 0;
        int countB = 0;
        char targetChar = 'z';
        int targetCount = 0;
        int currentCount = 0;

        if (end - start < targetIndex - 1) {
            return String.valueOf(NO_MATCH);
        }

        for (int i = start - 1; i < end; i++) {
            if (chars[i] == 'A') {
                countA++;
            } else {
                countB++;
            }

            if (i - start + 2 == targetIndex) {
                if (chars[i] == 'A') {
                    targetCount = countA;
                    targetChar = 'B';
                } else {
                    targetCount = countB;
                    targetChar = 'A';
                }

                break;
            }
        }

        for (int i = start - 1; i < end; i++) {
            if (chars[i] == targetChar) {
                currentCount++;
            }

            if (currentCount == targetCount) {
                return String.valueOf(i - start + 2);
            }
        }

        return String.valueOf(NO_MATCH);
    }
}
