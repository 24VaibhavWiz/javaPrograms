import java.util.Scanner;
public class odd_2 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("input the no.");
int n=sc.nextInt();
boolean status=is_odd(n);
if(status==true)
System.out.println("its true given no. is even");
else
System.out.println("its odd ");
	}
	public static boolean is_odd(int n)
	{
		while(n>=1)
		{
			n=n-2;
		}
		if(n==0)
			return true;
		else
			return false;
	}

}
