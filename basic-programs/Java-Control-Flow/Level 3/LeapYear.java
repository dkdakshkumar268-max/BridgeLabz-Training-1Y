import java.util.*;
public class LeapYear{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int x=sc.nextInt();
		if(x<1582)
		{
			System.out.println("Entered year should be >=1582");
		}
		else 
		{
			if(x%4==0&&x%100!=0)
			System.out.print("Leap year!!!");
		    else if(x%400==0)
			System.out.print("Leap year!!!");
		    else
			System.out.print("Not a Leap year!!!");
		}
	}
}
		
