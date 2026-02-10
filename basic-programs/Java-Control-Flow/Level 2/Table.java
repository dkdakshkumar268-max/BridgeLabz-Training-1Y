import java.util.*;
public class Table{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 6 to 9:");
		int x=sc.nextInt();
		if(x>=6&&x<=9)
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println(x+" * "+i+" = "+(x*i));
			}
		}
		else
		{
			System.out.println("Enter a valid number");
		}
		
	}
}
