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
/*
int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true)
				count++;
		}
		return count;

		public class Challenge {
  public static int countTrue(boolean[] arr) {
    int coun = 0;
    for (boolean i : arr) if (i) coun += 1;
    return coun;
  }
}
 */