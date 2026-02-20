package com.gla.stringapi.Extras;

import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0,j=s.length()-1;
        boolean flag=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++; j--;
        }
        System.out.println(flag);
    }
}