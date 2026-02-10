import java.util.*;
public class FactorialFor{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int x,f=1;
		System.out.println("Enter a number:");
		x=sc.nextInt();
		for(;x>=1;x--)
			f*=x;
		System.out.println("Factorial= "+f);
	}
}
