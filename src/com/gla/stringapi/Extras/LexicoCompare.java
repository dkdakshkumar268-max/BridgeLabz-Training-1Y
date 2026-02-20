package com.gla.stringapi.Extras;

import java.util.*;
public class LexicoCompare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int len=Math.min(a.length(),b.length());
        int i=0;
        while(i<len && a.charAt(i)==b.charAt(i))
            i++;
        if(i==len){
            if(a.length()==b.length())
                System.out.println("Equal");
            else if(a.length()<b.length())
                System.out.println(a+" comes before "+b);
            else
                System.out.println(b+" comes before "+a);
        }
        else if(a.charAt(i)<b.charAt(i))
            System.out.println(a+" comes before "+b);
        else
            System.out.println(b+" comes before "+a);
    }
}