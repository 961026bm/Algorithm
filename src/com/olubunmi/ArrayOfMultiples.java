package com.olubunmi;

import java.util.*;

public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length]; // declaration of array

        for(int i = 0; i < arr.length; i++){
            arr[i] = num * (i + 1);
            // System.out.println(num*(i+1));
        }
        return arr;
    }
}
