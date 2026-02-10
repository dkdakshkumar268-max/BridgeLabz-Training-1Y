import java.util.*;
public class Digit{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();     
        int count=0;                
        if(number==0){            
            count=1;
        }
        else{
            if(number<0){        
                number=-number;
            }
            while(number!=0){     
                number=number/10; 
                count++;             
            }
        }
        System.out.println("Number of digits = "+count); 
    }
}
