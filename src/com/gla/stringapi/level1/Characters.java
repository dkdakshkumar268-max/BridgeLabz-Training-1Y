package com.gla.stringapi.level1;
import java.util.*;
public class Characters{
    public static char[] getCharacters(String text){
        char[] characters=new char[text.length()];
        for(int i=0;i<text.length();i++) {
            characters[i]=text.charAt(i);
        }
        return characters;
    }
    public static boolean compareArrays(char[] firstArray,char[] secondArray) {
        if(firstArray.length!=secondArray.length)
            return false;
        for(int i=0;i<firstArray.length;i++) {
            if(firstArray[i]!=secondArray[i])
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        char[] userArray=getCharacters(text);
        char[] builtInArray=text.toCharArray();
        System.out.println(compareArrays(userArray,builtInArray));
    }
}