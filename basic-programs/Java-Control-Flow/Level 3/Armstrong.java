import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int originalNumber=number; 
        int sum=0;                   
        while(originalNumber!=0){ 
            int d=originalNumber%10; 
            sum+=(d*d*d); 
            originalNumber=originalNumber/10; 
        }
        if(sum==number){    
            System.out.println(number+" is an Armstrong Number");
        }
        else{
            System.out.println(number+" is not an Armstrong Number");
        }
    }
}
