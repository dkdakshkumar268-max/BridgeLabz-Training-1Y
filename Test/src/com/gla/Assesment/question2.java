package com.gla.Assessment;

public class question2 {
    public static void main(String[] args){
        int n1=6,n2=28;
        int sf1=0,sf2=0;
        for (int i=1;i<n1;i++){
            if(n1%i==0)
                sf1+=i;
        }
        for (int i=1;i<n2;i++){
            if(n2%i==0)
                sf2+=i;
        }
        double r1=sf1/n1;
        double r2=sf2/n2;
        if(r1==r2)
            System.out.println("FRIENDLY NUMBER!!!");
        else
            System.out.println("NOT A FRIENDLY NUMBER!!!");
    }
}