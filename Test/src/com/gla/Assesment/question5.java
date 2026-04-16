package com.gla.Assessment;

import java.util.Arrays;

public class question5 {
    public static void main(String args[]){
        int[] ar={1,2,3,1,2,2,1,3,5,3};
        Arrays.sort(ar);
        int e=ar[0],c=1;
        for(int i=1;i<ar.length;i++){
            if(ar[i]!=e){
                System.out.println(e+" OCCURS "+c+" TIMES");
                e=ar[i];
                c=1;
            }
            else
                c++;
        }
        System.out.println(e+" OCCURS "+c+" TIMES");
    }
}