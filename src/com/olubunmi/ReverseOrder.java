package com.olubunmi;

public class ReverseOrder {
    public static String reverse(final String str) {
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        return sb.toString();
        String result = "";
        for(int i = str.length()-1; i >= 0; i--) {
           result += str.charAt(i);

        }
          return result;
    }

}
/*
Python solution
def reverse(txt):
	result = ""
	for i in range(len(txt)-1, -1, -1):
		result += txt[i]
	return result;
 */
