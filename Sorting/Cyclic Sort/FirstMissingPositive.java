package com.company;

import java.util.Arrays;
//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = {1,2,0};
        System.out.println(CyclicSort(array));
    }

    public static int CyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] < array.length && array[i]>0 && array[i] != i+1) {
                int correct = array[i] - 1;
                if (array[i] != array[correct]) {
                    swap(array, i, correct);
                } else {
                   i++;
                }
            }else{
                i++;
            }
        }
        return search(array);
    }

    public static int search(int[] array){
        for (int j = 0; j < array.length; j++) {
           if(array[j] != j+1){
               return (j+1);
           }
        }
        return array.length+1;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}

