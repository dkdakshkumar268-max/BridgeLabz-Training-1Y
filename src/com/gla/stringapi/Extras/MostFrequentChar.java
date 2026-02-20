package com.gla.stringapi.Extras;

import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)]++;
        int max=0;
        char ans=' ';
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]>max){
                max=freq[s.charAt(i)];
                ans=s.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: "+ans);
    }
}