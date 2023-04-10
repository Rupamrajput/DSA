package com.company;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+@[a-z0-9.]+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("");
        System.out.println(matcher.matches());
    }
}
//         [abc]	a, b, or c (simple class)
//        [^abc]	Any character except a, b, or c (negation)
//        [a-zA-Z]	a through z, or A through Z, inclusive (range)
//        [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
//        [a-z&&[def]]	d, e, or f (intersection)
//        [a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
//        [a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z] (subtraction)
//.	Any character (may or may not match line terminators)
//        \d	A digit: [0-9]
//        \D	A non-digit: [^0-9]
//        \s	A whitespace character: [ \t\n\x0B\f\r]
//        \S	A non-whitespace character: [^\s]
//        \w	A word character: [a-zA-Z_0-9]
//        \W	A non-word character: [^\w]

//    public static void main(String[] args) {
//        Console console = System.console();
//        if (console == null) {
//            System.err.println("No console.");
//            System.exit(1);
//        }
//        while (true) {
//
//            Pattern pattern =
//                    Pattern.compile(console.readLine("%nEnter your regex: "));
//
//            Matcher matcher =
//                    pattern.matcher(console.readLine("Enter input string to search: "));
//
//            boolean found = false;
//            while (matcher.find()) {
//                console.format("I found the text" +
//                                " \"%s\" starting at " +
//                                "index %d and ending at index %d.%n",
//                        matcher.group(),
//                        matcher.start(),
//                        matcher.end());
//                found = true;
//            }
//            if (!found) {
//                console.format("No match found.%n");
//            }
//        }
//    }

