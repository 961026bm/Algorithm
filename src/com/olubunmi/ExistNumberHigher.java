package com.olubunmi;

public class ExistNumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        boolean isHigher = false;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= n) return true;
        }
        return isHigher;
    }
}
