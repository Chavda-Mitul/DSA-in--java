package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] array  = {1,1};
        int ans[] = CyclicSort(array);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] CyclicSort(int[] array){
        int i=0;
        int current;
        while(i<array.length){
            current = array[i]-1;
            if(array[i] != array[current]){
                swap(array,i,current);
            }else{
                i++;
            }
        }
        return Search(array);
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] Search(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i] != i+1){
                return new int[] {array[i],i+1};
            }
        }
        return new int[] {0,0};
    }
}
