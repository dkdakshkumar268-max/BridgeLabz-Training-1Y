import java.util.*;

public class NumberChecker4 {
    static int sumDigits(int n){ int s=0; while(n>0){ s+=n%10; n/=10;} return s; }
    static int prodDigits(int n){ int p=1; while(n>0){ p*=n%10; n/=10;} return p; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean prime=n>1;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) prime=false;

        int sq=n*n, temp=sq, sum=0;
        while(temp>0){ sum+=temp%10; temp/=10; }
        boolean neon=(sum==n);

        boolean spy=(sumDigits(n)==prodDigits(n));

        boolean auto=(String.valueOf(n*n).endsWith(String.valueOf(n)));

        boolean buzz=(n%7==0 || n%10==7);

        System.out.println("Prime: "+prime);
        System.out.println("Neon: "+neon);
        System.out.println("Spy: "+spy);
        System.out.println("Automorphic: "+auto);
        System.out.println("Buzz: "+buzz);
    }
}
