import java.util.*;
public class Friends{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amar's age:");
		int x=sc.nextInt();
		System.out.println("Enter Amar's height:");
	    double h1=sc.nextDouble();
		System.out.println("Enter Akbar's age:");
		int y=sc.nextInt();
		System.out.println("Enter Akbar's height:");
	    double h2=sc.nextDouble();
		System.out.println("Enter Anthony's age:");
		int z=sc.nextInt();
		System.out.println("Enter Anthony's height:");
	    double h3=sc.nextDouble();
		if(x<y&&x<z)
		{
			System.out.println("Youngest friend is Amar");
		}
		else if(y<x&&y<z)
		{
			System.out.println("Youngest friend is Akbar");
		}
	    else
		{
			System.out.println("Youngest friend is Anthony");
		}
		if(x>y&&x>z)
		{
			System.out.println("Tallest friend is Amar");
		}
		else if(y>x&&y>z)
		{
			System.out.println("Tallest friend is Akbar");
		}
	    else
		{
			System.out.println("Tallest friend is Anthony");
		}
	}
}
