package assin3;
import java.util.Scanner;
public class bin_eqv {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("enter a no.");
	int n=sc.nextInt();
	System.out.println("binary equvalent is"+bin(n));
	}
	public static int bin(int n)
	{
		if(n==0||n==1)
			return n;
		else{
			int r=n%2;
			return r+bin(n/2)*10;
			}
	}

}
