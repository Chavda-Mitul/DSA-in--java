package com.company;

import java.util.Arrays;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String str="(al)G(al)()()G";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
           StringBuilder str = new StringBuilder();
            for(int i=0;i<command.length()-1;i++){
                if(command.charAt(i) == '('&&command.charAt(i+1) == ')'){
                    str.append('o');
                }else if(command.charAt(i) == '('&&command.charAt(i+1) == 'a'){
                    str.append('a');
                    str.append('l');
                }else if(command.charAt(i) == 'G'){
                    str.append('G');
                }
            }
            if(command.charAt(command.length()-1) == 'G'){
                str.append('G');
            }
            return str.toString();
    }

}
