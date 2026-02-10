import java.util.*;
public class CheckNum{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		if(x>0)
			System.out.println("The given number is positive!");
		else if(x<0)
		    System.out.println("The given number is negative!");
	    else
		    System.out.println("The given number is zero!");
	}
}
