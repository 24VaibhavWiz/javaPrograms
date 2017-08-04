package reciursion;
class A
{
	void display()
	{
		System.out.println("Recursion used");
		display();
	}
}
public class ex1 {

	public static void main(String[] args) {
	A ob=new A();
	ob.display();

	}

}
