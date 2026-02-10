import java.util.*;
public class SumTillZero{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		double x,s=0.0;
		System.out.println("Enter number(s):");
		x=sc.nextDouble();
		while(x!=0)
		{
				s+=x;
				x=sc.nextDouble();
		}
		System.out.println("Sum= "+s);
	}
}
