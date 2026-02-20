import java.util.*;

public class NumberChecker3 {
    static int[] digits(int n){
        int[] d=new int[String.valueOf(n).length()];
        for(int i=d.length-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);

        int[] rev=new int[d.length];
        for(int i=0;i<d.length;i++) rev[i]=d[d.length-1-i];

        boolean same=true;
        for(int i=0;i<d.length;i++)
            if(d[i]!=rev[i]) same=false;

        boolean duck=false;
        for(int x:d) if(x==0) duck=true;

        System.out.println("Palindrome: "+same);
        System.out.println("Duck: "+duck);
    }
}
