import java.util.*;
class B
{
String name;
int roll;
double marks;
	void display()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Name Roll and Marks");
		name = sc.nextLine();
		roll=sc.nextInt();
		marks=sc.nextDouble();
	}
}	class C extends B
		{
	
	void display1()
	{
		System.out.println("Student Details");
		System.out.println("Name:" +name);
		System.out.println("Roll:" +roll);
		System.out.println("Marks:" +marks);
	}
}

public class A {

	public static void main(String[] args) {
	
    B ob = new B();
    C ob1 = new C();  
    ob.display();
    ob1.display1();
    
	}

}
