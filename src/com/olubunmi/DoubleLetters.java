package com.olubunmi;

public class DoubleLetters {
    public static boolean doubleLetters(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i-1) == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
