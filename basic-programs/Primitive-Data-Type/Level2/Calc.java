import java.util.*;
public class Calc{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
	    double number1=sc.nextDouble();
		System.out.println("Enter second number:");
		double number2=sc.nextDouble();
		double add=number1+number2;
		double sub=number1-number2;
		double multi=number1*number2;
		double div=number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+ " and "+number2+ " is "+add+ ","+sub+","+multi+", and "+div);
	}
}