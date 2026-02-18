package com.gla.stringapi.level1;
import java.util.*;
public class Lowercase{
    public static String toLower(String text){
        String res="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='A'&&ch<='Z')
                ch=(char)(ch+32);
            res+=ch;
        }
        return res;
    }
    public static boolean compare(String a,String b){
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))
                return false;
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String user=toLower(text);
        String built=text.toLowerCase();
        System.out.println(compare(user,built));
    }
}