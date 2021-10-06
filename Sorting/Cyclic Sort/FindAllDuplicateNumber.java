package com.company;

import java.util.ArrayList;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(CyclicSort(array));
    }

    public static ArrayList<Integer> CyclicSort(int[] array){
        int i=0;
        int current;
        while(i<array.length) {
                current = array[i]-1;
                if (array[i] != array[current]) {
                    swap(array, i, current);
                } else {
                    i++;
                }
        }
        return search(array);
    }

    public static ArrayList<Integer> search(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++){
            if(array[i] != i+1){
                list.add(array[i]);
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
