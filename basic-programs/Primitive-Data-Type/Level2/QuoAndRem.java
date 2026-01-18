import java.util.*;
public class QuoAndRem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter second number:");
		int y=sc.nextInt();
		System.out.println("The Quotient is "+x/y+" and Reminder is "+x%y+" of two numbers "+x+" and "+y);
	}
}