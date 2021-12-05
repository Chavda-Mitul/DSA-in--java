package com.company.Bits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
            char[] array = {'a','b','c'};

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
            int t = 0;

            for(int i=0;i<8;i++){
                String set = "";
                int temp = i;
                for(int j=array.length-1;j>=0;j--){
                    int r = temp % 2;
                    temp /= 2;

                    if(r==0){
                        set ="-\t"+set;
                    }else{

                        set = array[j]+"\t"+set;
                    }
                }
                    System.out.println(set);
            }
//        System.out.println(Arrays.toString(ans));
//        System.out.println(str.reverse());
    }
}
