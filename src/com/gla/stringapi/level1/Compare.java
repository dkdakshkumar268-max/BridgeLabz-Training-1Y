package com.gla.stringapi.level1;
import java.util.*;
public class Compare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean userResult = true;
        if (s1.length() != s2.length()){
            userResult = false;
        }
        else{
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    userResult = false;
                    break;
                }
            }
        }
        boolean builtIn = s1.equals(s2);
        System.out.println(userResult);
        System.out.println(builtIn);
    }
}

