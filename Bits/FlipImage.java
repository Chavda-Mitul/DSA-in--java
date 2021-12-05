package com.company.Bits;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] array = {{1,1,0},
                        {1,0,1},
                        {0,0,0}};

//        int[][] newArray = new int[3][3];
        int length = array.length;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < (array.length+1)/2; j++) {
                    swap(array,i,j, 2-j);
            }
        }

        for (int i = 0; i < array.length ; i++) {
        System.out.println(Arrays.toString(array[i]));
        }

    }
    public static void swap(int[][] array,int i,int a, int b){
        int temp = (array[i][a])^1;
        array[i][a] = (array[i][b])^1;
        array[i][b] = (temp);
    }
}
