package com.company;

import java.util.Arrays;


public class Selection_Sort {
    public static void main(String[] args) {
        //In this sorting algo we select the min/max element and then swap it with its correct position.
        int[] array = {2,2,2,1};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectionSort(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            int last = array.length-i-1;
            int maxIndex = getMaxIndex(array,0,last);
            swap(array,maxIndex,last);
        }
    }

   public static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int getMaxIndex(int[] array, int start, int last) {
        int max = start;
        for (int i = start; i <= last;i++) {
            if(array[i]>array[max]){
                max = i;
            }
        }
        return max;
    }

}
