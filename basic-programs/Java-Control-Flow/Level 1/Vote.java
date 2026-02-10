import java.util.*;
public class Vote{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int x=sc.nextInt();
		if(x>=18)
			System.out.println("The person's age is "+x+" and can vote.");
		else
			System.out.println("The person's age is "+x+" and cannot vote.");
	}
}
