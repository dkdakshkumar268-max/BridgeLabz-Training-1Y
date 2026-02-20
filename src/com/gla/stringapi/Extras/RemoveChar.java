package com.gla.stringapi.Extras;

import java.util.*;
public class RemoveChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char remove=sc.next().charAt(0);
        String res="";
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=remove)
                res+=s.charAt(i);
        System.out.println("Modified String: "+res);
    }
}