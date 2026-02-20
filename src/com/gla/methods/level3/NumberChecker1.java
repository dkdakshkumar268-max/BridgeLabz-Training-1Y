import java.util.*;

public class NumberChecker1 {
    static int[] digits(int n){
        int[] d = new int[String.valueOf(n).length()];
        for(int i=d.length-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), c=String.valueOf(n).length();
        int[] d=digits(n);

        boolean duck=false;
        for(int x:d) if(x==0) duck=true;

        int sum=0; 
        for(int x:d) sum+=Math.pow(x,c);
        boolean arm=(sum==n);

        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int x:d){
            if(x>max){smax=max;max=x;}
            else if(x>smax) smax=x;

            if(x<min){smin=min;min=x;}
            else if(x<smin) smin=x;
        }

        System.out.println("Digits: "+c);
        System.out.println("Duck: "+duck);
        System.out.println("Armstrong: "+arm);
        System.out.println("Largest & 2nd Largest: "+max+" "+smax);
        System.out.println("Smallest & 2nd Smallest: "+min+" "+smin);
    }
}
