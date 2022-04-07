package com.olubunmi;

public class TranscribeDna {
    //  String dnaToRna(String strand)
//    String strand = new ('G, C, T, A');

        public static void main(String[] args) {
//            String d1 = strand.replaceAll('G', 'C');
//            String d2 = d1.replaceAll('C', 'G');
//            String d3 = d2.replaceAll('C', 'N');
//            String d4 = d3.replaceAll('T', 'A');
//            String d5 = d4.replaceAll('A', 'U');
//            String d6 = d5.replaceAll('G', 'N');
//            return d5;



            //convert G,C,T,A to C,G,A,U
//            String str = "";
//            for (int i = 0; i < strand.length(); i++) {
//                switch (strand.charAt(i)) {
//                    case: 'G';
//                        System.out.println('C');
//                        break;
//                    case: 'C';
//                        System.out.println('G');
//                        break;
//                    case: 'T';
//                        System.out.println('A');
//                        break;
//                   case: 'A';
//                        System.out.println('U');
//                        break;
                 //   return str;
                }
            }
    //}
//}
/* The replaceAll() method throws the PatternSyntaxException when there is an improper regular expression.
The difference between replace() and replaceAll() method is that the replace() method replaces all the occurrences of old char with new char while replaceAll() method replaces all the occurrences of old string with the new string.

Examples:
classMain{
  publicstaticvoidmain(String[] args){
    String str1 = "Java123is456fun";
// regex for sequence of digitsString regex = "\\d+";
// replace all occurrences of numeric// digits by a space
System.out.println(str1.replaceAll(regex, " "));
}
}
// Output: Java is fun


class Main {
  public static void main(String[] args) {
    String str1 = "aabbaaac";
    String str2 = "Learn223Java55@";

    // regex for sequence of digits
    String regex = "\\d+";

    // all occurrences of "aa" is replaceAll with "zz"
    System.out.println(str1.replaceAll("aa", "zz"));  // zzbbzzac


    // replace a digit or sequence of digits with a whitespace
    System.out.println(str2.replaceAll(regex, " "));  // Learn Java @


  }
}
Escaping Characters in replaceAll()
The replaceAll() method can take a regex or a typical string as the first argument. It is because a typical string in itself is a regex.

In regex, there are characters that have special meaning. These metacharacters are:

\ ^ $ . | ? * + {} [] ()
If you need to match substring containing these metacharacters, you can either escape these characters using \ or use the replace() method.

// Program to replace the + character
class Main {
  public static void main(String[] args) {
    String str1 = "+a-+b";

    // replace "+" with "#" using replaceAll()
    // need to escape "+"
    System.out.println(str1.replaceAll("\\+", "#"));  // #a-#b


    // replace "+" with "#" using replace()
    System.out.println(str1.replace("+", "#"));  // #a-#b

  }
}

* */