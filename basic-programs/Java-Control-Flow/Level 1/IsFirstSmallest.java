import java.util.*;
public class IsFirstSmallest{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter second number:");
		int y=sc.nextInt();
		System.out.println("Enter third number:");
		int z=sc.nextInt();
		if(x<y&&x<z)
			System.out.println("Is the first number the smallest? Yes");
		else
			System.out.println("Is the first number the smallest? No");
	}
}
