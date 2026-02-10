import java.util.*;
public class SumOfNaturalNumFor{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		int t=x;
		if(x>0)
		{
			System.out.println("The sum of "+x+" natural numbers using formulae is "+((x*(x+1))/2));
			int s=0;
			for(;x>=1;x--)
				s+=x;
			System.out.println("The sum of "+t+" natural numbers using for loop is "+s);
		}
		else
		{
			System.out.println("The number "+x+" is not a natural number");
		}
    }
}
