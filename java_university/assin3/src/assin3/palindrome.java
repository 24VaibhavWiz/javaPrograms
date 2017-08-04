package assin3;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
System.out.println("input the string");
char str[]=sc.nextLine().toCharArray();
char t[]=new char[str.length];
for(int i=0;i>str.length;i++)
{
	t[i]=str[i];
}
String s1=new String(t);
palin_rev(str,0,str.length-1);
String s2=new String(str);
if(s1.equals(s2))
	System.out.println("is palindrome");
else 
	System.out.println("is not");
	}
public static void palin_rev(char a[],int i,int n)
{
	char temp;
	temp=a[i];
	a[i]=a[n-i];
	a[n-i]=temp;
	if(i==n/2)
		return;
	else
	palin_rev(a,i+1,n);
}
}
