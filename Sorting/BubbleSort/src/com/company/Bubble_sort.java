package com.company;
import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        // 3,4,2,1,5
        bubbleSortWithTemp(array);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSortWithTemp(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j]>array[j+1]){
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j+1] + array[j+1];
                }
            }
        }
    }

    public static void bubble_Sort_optimize(int[] array){
        int temp;
        boolean isSwaped;
        for (int i = 0; i < array.length; i++) {
            isSwaped = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwaped = true;
                }
                if(!isSwaped){
                    break;
                }
            }
        }
    }
}
