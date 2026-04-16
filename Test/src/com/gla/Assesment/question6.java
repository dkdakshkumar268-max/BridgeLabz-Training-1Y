package com.gla.Assessment;

public class question6 {
    public static void main(String []args){
        int[] ar={10,20,30,40,50,60,70};
        System.out.println(ar);
        int k=3,c=0;
        int[] res=new int[ar.length];
        for(int i=k;i<ar.length;i++){
            res[c]=ar[i];
            c++;
        }
        for(int i=0;i<k;i++){
            res[c]=ar[i];
            c++;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}