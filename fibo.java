package assin3;
import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the no.");
	int n=sc.nextInt();
	System.out.println("nth fibonacci no. is"+fibo_no(n));
	}
	public static int fibo_no(int n)
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return (fibo_no(n-1)+fibo_no(n-2));
	}

}
