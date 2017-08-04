package assin3;
class Box<T>
{
	T a;
	void set(T x)
	{
		a=x;
	}
	void display()
	{
		System.out.println(a);
	}
}
public class gen_ric {

	public static void main(String[] args) {
		Box <Integer> ob1=new Box <Integer>();
		Box <Double> ob2=new Box <Double>();
		Box <String> ob3=new Box <String>();
		ob1.set(10000);
		ob1.display();
		ob2.set(100000.9999);
		ob2.display();
		ob3.set("BAIBHAB");
		ob3.display();
	}

}
