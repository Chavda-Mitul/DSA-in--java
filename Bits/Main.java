package com.company.Bits;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        int base = 2;
        String str = DecimalToBinary(n,base);
        System.out.println(str);
        int ans = BinaryToDecimal(str);
        System.out.println(ans);
    }
    public static String DecimalToBinary(int n, int base){
        int rem;
        StringBuilder str= new StringBuilder();
        while(n>0){
            rem = n % base;
            n /= base;
            str.append(rem);
        }
        str.reverse();
        return str.toString();
    }
    public static int BinaryToDecimal(String num){
        int ans =0;
        int base = 1;
        int length = num.length()-1;
        for (int i = length; i >=0 ; i--) {
            if(num.charAt(i) == '1'){
                ans += base;
            }
            base *= 2;
        }
        return ans;
    }
}
