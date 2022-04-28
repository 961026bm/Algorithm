package com.olubunmi;

public class SumOfArrayElement {
    public static int arraySum(int[] arr) {
        int sum = 0; // initialize sum

        // Iterate through all elements
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];         // and add them to sum

        return sum;
    }
}
