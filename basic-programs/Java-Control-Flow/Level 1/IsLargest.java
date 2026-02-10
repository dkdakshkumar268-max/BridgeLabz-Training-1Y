import java.util.*;
public class IsLargest{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter second number:");
		int y=sc.nextInt();
		System.out.println("Enter third number:");
		int z=sc.nextInt();
		if(x>y&&x>z)
		{
			System.out.println("Is the first number the greatest? Yes");
		    System.out.println("Is the second number the greatest? No");
		    System.out.println("Is the third number the greatest? No");
		}
		else if(y>x&&y>z)
		{
			System.out.println("Is the first number the greatest? No");
		    System.out.println("Is the second number the greatest? Yes");
		    System.out.println("Is the third number the greatest? No");
		}
	    else
		{
			System.out.println("Is the first number the greatest? No");
		    System.out.println("Is the second number the greatest? No");
		    System.out.println("Is the third number the greatest? Yes");
		}
	}
}
