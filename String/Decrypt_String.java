package com.company;
import java.util.ArrayList;
public class Decrypt_String {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("10#11#12");
       StringBuilder s = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = str.length(); i > 1; i++) {
           if(str.charAt(i) == '#'){
               list.add((int)str.charAt(i));
               list.add((int)str.charAt(i-1));
               i--;
           }else{
               list.add((int)str.charAt(i));
           }
        }
        System.out.println(list);
    }
}
