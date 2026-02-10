import java.util.*;
public class Bonus{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary:");
		double x=sc.nextDouble();
		System.out.println("Enter year of service:");
		double y=sc.nextDouble();
		double b=0;
		if(y>5)
		{
			b=x*(5.0/100);
		}
		System.out.println("Bonus: "+b);
	}
}
		
