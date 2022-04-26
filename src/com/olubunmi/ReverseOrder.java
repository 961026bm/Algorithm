package com.olubunmi;

public class ReverseOrder {
    public static String reverse(final String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
