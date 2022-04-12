package com.olubunmi;

public class NumericString {
    public static String add(String a, String b) {
//        if (a == null || b == null || a.equals("") || b.equals(""))
//            return "Invalid Operation";
//        int num = Integer.parseInt(a);
//        int num1 = Integer.parseInt(b);
//        int num2 = num + num1;
//        System.out.println(num2);
//        return String.valueOf(num2);
        try {
            int num = Integer.parseInt(a);
        int num1 = Integer.parseInt(b);
        int num2 = num + num1;
        System.out.println(num2);
        return String.valueOf(num2);
        }catch (Exception e) {
            return "Invalid Operation";
        }

    }
}

/* public class NumericString {
you need to parse the string to integer before adding
You CANNOT ADD STRING
then return it back to string with String.valueOf()
}//        if (a == null || b == null || a.equals("") || b.equals(""))
//            return "Invalid Operation";
//        int num = Integer.parseInt(a);
//        int num1 = Integer.parseInt(b);
//        int num2 = num + num1;
//        System.out.println(num2);
//        return String.valueOf(num2);
*/