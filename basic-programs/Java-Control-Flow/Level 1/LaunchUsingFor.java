import java.util.*;
public class LaunchUsingFor{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		for(;x>=1;x--)
		{
			System.out.println(x);
		}
	}
}
