import java.util.*;

public class NumberChecker2 {
    static int[] digits(int n){
        int[] d=new int[String.valueOf(n).length()];
        for(int i=d.length-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);

        int sum=0; 
        for(int x:d) sum+=x;

        int sq=0;
        for(int x:d) sq+=Math.pow(x,2);

        System.out.println("Sum: "+sum);
        System.out.println("Sum of Squares: "+sq);
        System.out.println("Harshad: "+(n%sum==0));

        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i;
        for(int x:d) freq[x][1]++;

        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++)
            if(freq[i][1]>0)
                System.out.println(freq[i][0]+" -> "+freq[i][1]);
    }
}
