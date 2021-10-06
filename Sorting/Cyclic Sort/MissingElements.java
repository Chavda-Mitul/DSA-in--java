package com.company;

import java.util.ArrayList;

public class MissingElements {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,2};
        System.out.println(CyclicSort(array));
    }

    public static ArrayList<Integer> CyclicSort(int[] array) {
        int i=0;
        while(i < array.length){ // 5 4 3 2 1
            int correct = array[i]-1;
            if(array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }
        return search(array);
    }

    public static ArrayList<Integer> search(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= array.length; i++) {
            if(array[i-1] != i){
                list.add(i);
            }
        }
        return list;
    }


    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
