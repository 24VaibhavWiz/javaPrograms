package reciursion;
import java.util.*;
class Q
{ int n,sum=0,c=0;
	void add()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the vaue of n");
		n-=sc.nextInt();
		c=n;
	    sum=sum+n;
		add();
		System.out.println(sum);
		c++;
	}
}
public class ex2 {

	public static void main(String[] args) {
Q ob =new Q();
ob.add();

	}

}
