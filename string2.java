
class q {
int a=10;
void display()
{
	System.out.println(a);
}
}

 class y extends q
{
	int b =20;
	void display()
	{
		System.out.println(b);
	}
}
 class x extends y
 {
	 int c=30;
	 void display()
	 {
		 System.out.println(c);
	 }
 }
 public class z
 {
	 public static void main(String []args)
	 {
		 q ob = new x();
		 ob.display();
	 }
 }