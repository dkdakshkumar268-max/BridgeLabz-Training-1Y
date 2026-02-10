import java.util.*;
class GreatestFactorWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
        int number= sc.nextInt();
		int greatestFactor=0;
		int c=number-1;
        if(number<=0){
            System.out.println("Enter a positive number");
        }
        else{
            while(c>=1){
                if(number%c==0){
                    greatestFactor=c;
					break;
                }
				c--;
            }
        }
		System.out.println("Greatest Factor= "+greatestFactor);
    }
}
