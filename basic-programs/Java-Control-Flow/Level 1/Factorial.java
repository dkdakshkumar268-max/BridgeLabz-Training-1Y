import java.util.*;
public class Factorial{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int x,f=1;
		System.out.println("Enter a number:");
		x=sc.nextInt();
		while(x>=1)
		{
			f*=x;
			x--;
		}
		System.out.println("Factorial= "+f);
	}
}
