import java.util.Scanner;
class SwitchExample{
public static void main(String []args){
Scanner ab = new Scanner(System.in);
int a;
System.out.print("Enter  Number :");
a = ab.nextInt();
switch(a){
case 1 : System.out.print("HELLO WORLD !!");
break;
case 2 : System.out.println("Hello Java!!");
break;
default : System.out.println("byee");
break;
}
ab.close();
}
}