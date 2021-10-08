package com.company;

import java.util.Arrays;

public class Array_Partition_I {
    public static void main(String[] args) {
        int[] array = {1,4,3,2};
        InsertionSort(array);
        int answer = MinSum(array);
        System.out.println(answer);
    }

    public static int MinSum(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length; i+=2) {
            sum += Math.min(array[i],array[i+1]);
        }
        return sum;
    }

    public static void InsertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
