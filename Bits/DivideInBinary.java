package com.company.Bits;

public class DivideInBinary {
    public static void main(String[] args) {
     int num = 10;
     int div = 3;
     int ans = 0;
     int rem = 0;
     int ct = 0;
     int temp = div;
    while(div-rem>0){
        ct = 0;
        while(div-temp>0){
            ct++;
            temp *= 2;
        }
        ct -= 1;
        ans += 1 << ct;
        rem = num - div * ans;
        temp = rem;
    }
        System.out.println(ans);
    }
}
