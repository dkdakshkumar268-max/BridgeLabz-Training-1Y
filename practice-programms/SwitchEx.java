import java.util.Scanner;
public class SwitchEx{
public static void main(String []args){
Scanner ab = new Scanner(System.in);
int a;
System.out.print("Enter  Number :");
a = ab.nextInt();
switch(a){
case 1 : 
continue;
case 2 : System.out.println("Hello Java!!");
default : System.out.println("byee");
}
ab.close();
}
}