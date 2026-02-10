import java.util.*;
public class DivByFive{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		if(x%5==0)
			System.out.println("Is the number "+x+ " divisible by 5? Yes");
		else
			System.out.println("Is the number "+x+ " divisible by 5? No");
	}
}
		
