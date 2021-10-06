package com.company;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = {7,8,9,11,12};
        System.out.println(CyclicSort(array));
    }

    public static int CyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] < array.length && array[i]>0 && array[i] != i+1) {
                int correct = array[i] - 1;
                if (array[i] != i+1) {
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
            if(array[j]>0&&array[j]!=j+1){
                return (array[j-1]+1);
            }
        }
        return array.length;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}

