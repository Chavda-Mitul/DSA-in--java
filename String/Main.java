package com.company;

public class Main {

    public static void main(String[] args) {
        String str =  "1.1.1.1";
        System.out.println(An_IP_Address(str));
    }
    public static StringBuilder An_IP_Address(String str){
        StringBuilder ipString = new StringBuilder();
        for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '.'){
                    ipString.append("[.]");
                }else{
                    ipString.append(str.charAt(i));
                }
        }
        return ipString;
    }
}
