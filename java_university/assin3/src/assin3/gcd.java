package assin3;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1 no.");
	int n=sc.nextInt();
	System.out.println("enter the 2 no.");
	int m=sc.nextInt();
	System.out.println("the gcd of above is "+gcd(n,m));
	}
	public static int gcd(int n,int m)
	{
		if(m==0)
			return n;
		else
			return gcd(n,n%m);
	}

}
