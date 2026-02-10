import java.util.*;
public class SpringSeason{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day:");
		int x=sc.nextInt();
		System.out.println("Enter the month:");
		int y=sc.nextInt();
		if (x>=20&&y>=3&&y<6)
			System.out.println("It is a Spring Season");
		else if (x<=20&&y>3&&y<=6)
			System.out.println("It is a Spring Season");
		else
			System.out.println("Not a Spring Season");
		}
}
