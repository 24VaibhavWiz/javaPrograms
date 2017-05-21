package assin3;
import java.util.Scanner;
public class pow {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("input the 1 no.");
		int n=sc.nextInt();
		System.out.println("input the 2 no.");
		int m=sc.nextInt();
		System.out.println("n^m is"+pow_r(n,m));
	}
public static int pow_r(int n,int m)
{
	if(m==0)
		return 1;
	else
		return(n*pow_r(n,m-1));
}
}
