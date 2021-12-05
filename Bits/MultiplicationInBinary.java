package com.company.Bits;

public class MultiplicationInBinary {
    public static void main(String[] args) {
        int num = 100;
        int mul = 9;
        int ans = 0;
        int i =0;
        while(mul>0){
            if((mul&1)==1){
                ans += num;
            }
            num <<=1;
            mul >>= 1;
//            i++;
        }
        System.out.println(ans);
    }
}
