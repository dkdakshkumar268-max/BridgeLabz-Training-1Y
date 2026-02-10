import java.util.*;
class PowerWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
        int n= sc.nextInt();
		System.out.println("Enter power:");
        int p= sc.nextInt();
		int result=1,i=1;
        if(n<=0||p<=0){
            System.out.println("Enter positive number(s)");
        }
        else{
            while(i<=p) {
                result*=n;
				i++;
            }
			System.out.println(result);
        }
    }
}
