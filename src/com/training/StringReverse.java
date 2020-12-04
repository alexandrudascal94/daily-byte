package com.training;

/*
* This question is asked by Google.
* Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
*
* */
public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("cat"));
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();

        for (int i = 1; i < chars.length / 2; i++) {
            char temp = chars[i - 1];
            chars[i - 1] = chars[chars.length - i];
            chars[chars.length - i] = temp;
        }
        return new String(chars);
    }
}
