package com.gla.stringapi.Extras;

import java.util.*;
public class LongestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] w=s.split(" ");
        String max=w[0];
        for(int i=1;i<w.length;i++)
            if(w[i].length()>max.length())
                max=w[i];
        System.out.println(max);
    }
}