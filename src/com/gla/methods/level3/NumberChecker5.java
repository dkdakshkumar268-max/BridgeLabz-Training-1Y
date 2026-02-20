import java.util.*;

public class NumberChecker5 {
    static int fact(int n){ int f=1; for(int i=1;i<=n;i++) f*=i; return f; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<n;i++) if(n%i==0) sum+=i;

        System.out.println("Perfect: "+(sum==n));
        System.out.println("Abundant: "+(sum>n));
        System.out.println("Deficient: "+(sum<n));

        int temp=n, s=0;
        while(temp>0){ s+=fact(temp%10); temp/=10; }

        System.out.println("Strong: "+(s==n));
    }
}
