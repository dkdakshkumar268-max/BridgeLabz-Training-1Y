import java.util.*;
class Student{
	int id,age; String name;
	public static void main (String args[]){
		Student s1=new Student();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter ID:");
	    s1.id=sc.nextInt();
		System.out.println("Enter name:");
	    s1.name=sc.next();
		System.out.println("Enter age:");
	    s1.age=sc.nextInt();
		s1.DisplayDetails();
	}
	public void DisplayDetails(){
		String status= "Active";
		System.out.println("ID: " +id);
		System.out.println("NAME: " +name);
		System.out.println("AGE: " +age);
		System.out.println("Status: " +status);
		
	}
}