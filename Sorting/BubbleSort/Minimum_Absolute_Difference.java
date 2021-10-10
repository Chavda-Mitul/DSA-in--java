package com.company;

import java.util.*;

public class Minimum_Absolute_Difference {
    public static void main(String[] args) {
        int[] array = {4,2,1,3};
        Arrays.sort(array);
        int answer = array[1]-array[0];
        System.out.println(answer);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i< array.length-1;i++){
            if(array[i+1]-array[i]==answer){
                System.out.println(array[i]+" "+array[i+1]);
                list.add(Arrays.asList(array[i - 1], array[i]));
            }
        }
    }

    public static int MinDifference(int[] array) {
        int min=array[1]-array[0];
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]-array[i]<min){
                min = array[i+1]-array[i];
            }
        }
        return min;
    }
}
