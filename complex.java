
class complex_ex
{  
	int real;
	int img;
complex_ex()
{}
	complex_ex(int r,int i)
	{

		real=r;
		img=i;
		
	}

	public complex_ex add(complex_ex c1, complex_ex c2) {
		complex_ex c3=new complex_ex();
		c3.real=c1.real + c2.real;
		c3.img=c1.img + c2.img;
		return c3;
	}
}

public class complex {

	public static void main(String[] args) {
	
complex_ex c1=new complex_ex(100,200);
complex_ex c2=new complex_ex(200,300);
complex_ex c4=new complex_ex();
c4=c4.add(c1,c2);
System.out.println("sum:"+c4.real+" + i"+c4.img);
	}
}
