package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        InsertionSort(array);
        System.out.println(Arrays.toString(array));

    }
    
    public static void InsertionSort(int[] array) {
        int i=0;
        int n = array.length;
        while(i<n-1){
            int j=i+1;
            while(j>0){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
                j--;
            }
            i++;
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
