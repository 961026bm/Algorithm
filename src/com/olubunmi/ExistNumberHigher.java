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
//solution in python
/*
* def exists_higher(lst, n):
	#arrays in python are called lists
	is_higher = False #booleans in python are in first letter capital
	for num in lst:
	if num >= n:
	is_higher = True
	return is_higher*/