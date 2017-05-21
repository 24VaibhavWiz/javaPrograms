package assin3;
import java.util.Scanner;
public class rev_dig {
	static int rev=0;
public static void main(String []args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter the no. to be reversed");
	int n=sc.nextInt();
	System.out.println("the reversed no. is "+ rev_digit(n));
}
public static int rev_digit(int n)
{
	if(n==0)
		return 1;
	else
		rev=rev*10 +n%10;
	rev_digit(n/10);
	return rev;
}
}
