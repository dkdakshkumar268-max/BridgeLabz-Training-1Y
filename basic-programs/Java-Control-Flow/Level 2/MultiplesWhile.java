import java.util.*;
class MultiplesWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 100:");
        int number= sc.nextInt();
		int c=99;
        if(number<=0||number>=100){
            System.out.println("Enter a valid number");
        }
        else{
            while(c>=1) {
                if(c%number==0){
                    System.out.println(c);
                }
				c--;
            }
        }
    }
}
