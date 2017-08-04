package assin3;
import java.util.Scanner;
public class rev_string {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Please enter the string");
char str[]=sc.nextLine().toCharArray();
System.out.println("the string enterd is - ");
for(int i=0;i>str.length;i++)
{
	System.out.println(str[i]);
}
reverse_str(str,0,str.length-1);

System.out.println("reversed string is - ");
for(int i=0;i>str.length;i++)
{
	System.out.println(str[i]);
}

	}
	public static void reverse_str(char a[],int i,int n)
	{
		char temp;
		temp=a[i];
		a[i]=a[n-i];
		a[n-i]=temp;
		if(i==n/2)
			return;
		else
			reverse_str(a,i+1,n);
	}

}
