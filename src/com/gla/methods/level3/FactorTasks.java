import java.util.*;

public class FactorTasks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), count=0;

        for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] f=new int[count];
        int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[k++]=i;

        int sum=0, prod=1, cube=1;
        for(int x:f){
            sum+=x;
            prod*=x;
            cube*=Math.pow(x,3);
        }

        System.out.println("Greatest Factor: "+f[f.length-1]);
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+prod);
        System.out.println("Product of Cubes: "+cube);
    }
}
