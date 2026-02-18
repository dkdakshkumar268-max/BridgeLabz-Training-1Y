package com.gla.stringapi.level1;
import java.util.*;
public class SubString{
    public static String createSubstring(String text,int startIndex,int endIndex) {
        String result="";
        for (int i=startIndex;i<endIndex;i++) {
            result+=text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String first,String second) {
        if (first.length()!=second.length())
            return false;
        for (int i=0; i<first.length();i++) {
            if (first.charAt(i)!=second.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();
        String userSubstring=createSubstring(text,startIndex,endIndex);
        String builtInSubstring=text.substring(startIndex,endIndex);
        System.out.println(userSubstring);
        System.out.println(builtInSubstring);
        System.out.println(compareStrings(userSubstring,builtInSubstring));
    }
}