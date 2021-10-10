package com.company;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] array = {7,7,7,7};
        int[]  answer =  AreSmallerThanTheCurrentNumber(array);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] AreSmallerThanTheCurrentNumber(int[] array) {
        int[] answer  = new int[array.length];
        int ct=0;
        for (int i = 0; i < array.length; i++) {
            ct = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] > array[j]){
                    ct++;
                }
            }
            answer[i] = ct;
        }
        return answer;
    }
}
