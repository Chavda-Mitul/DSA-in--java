package com.company.Bits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] array = {1,2,2,4};
        int xor=1;
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        System.out.println(xor);

    }
}
