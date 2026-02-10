import java.util.*;
public class SumOfNaturalNum{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		if(x>0)
			System.out.println("The sum of "+x+" natural numbers is "+((x*(x+1))/2));
		else
			System.out.println("The number "+x+" is not a natural number");
		}
}
