package com.olubunmi;

public class TrueCount {
    public static int countTrue(boolean[] arr) {

        int trueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                trueCount++;
            }
        }
        return trueCount;
    }
}
