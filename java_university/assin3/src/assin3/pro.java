package assin3;
import java.util.Scanner;
public class pro {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("input the 1 no.");
		int n=sc.nextInt();
		System.out.println("input the 2 no.");
		int m=sc.nextInt();
		System.out.println("n*m is"+pro_r(n,m));
	}
public static int pro_r(int n,int m)
{
	if(n==0||m==0)
		return 0;
	else
		return(n+pro_r(n,m-1));
}
}




