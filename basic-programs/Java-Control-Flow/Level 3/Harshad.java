import java.util.*;
public class Harshad{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int t=number; 
        int sum=0;
        while(number>0){
            int d=number%10;
            sum+=d;
            number/=10;
        }
        if(t%sum==0){
            System.out.println("Harshad Number");
        } 
		else{
            System.out.println("Not a Harshad Number");
        }
    }
}
