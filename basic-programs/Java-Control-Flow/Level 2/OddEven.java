import java.util.*;
public class OddEven{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		int e=0,o=0;
		if(x>0)
		{
			for (int i=1;i<=x;i++)
		    {
				if(i%2==0)
			    e+=i;
		        else
			    o+=i;
		    }
		    System.out.println("Sum of even numbers till "+x+" is "+e );
		    System.out.println("Sum of odd numbers till "+x+" is "+o );
		}
		else 
		{
			System.out.println(x+" is not a Natural number");
		}
	}
}
		
