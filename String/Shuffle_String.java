package com.company;

public class Shuffle_String {
    public static void main(String[] args) {
        String  s = "aiohn";
        int[] index = {3,1,4,2,0};
       String str =  restoreString(s,index);
        System.out.println(str);
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 4; i++) {
               str.append(s.charAt(indices[i]));
        }
         return str.toString();
    }
}
