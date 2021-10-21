package com.company;

import java.util.Locale;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String word1[] = {"abc", "d", "defg"}, word2[] = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder mergeword1 = new StringBuilder();
        StringBuilder mergeword2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            mergeword1.append(word1[i]);

        }
        for (int i = 0; i < word2.length; i++) {
            mergeword2.append(word2[i]);
        }
        
        return (mergeword1.toString().equals(mergeword2.toString()));
    }
}
