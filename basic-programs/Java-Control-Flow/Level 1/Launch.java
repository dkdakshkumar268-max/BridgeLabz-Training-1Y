import java.util.*;
public class Launch{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		while(x>=1)
		{
			System.out.println(x);
			x--;
		}
	}
}
