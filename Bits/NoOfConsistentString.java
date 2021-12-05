package com.company.Bits;

import java.util.Arrays;

public class NoOfConsistentString {
    public static void main(String[] args) {
        String allowed = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] hash = new boolean[26];
        for(int i=0;i<allowed.length();i++)
        {
            hash[allowed.charAt(i)-'a'] = true;
        }
        int ct = words.length;

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!hash[words[i].charAt(j)-'a']){
                    System.out.println(words[i]);
                    ct--;
                    break;
                }
            }
        }

        return ct;
    }
}
