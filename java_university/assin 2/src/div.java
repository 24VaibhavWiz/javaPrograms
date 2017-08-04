import java.util.Scanner;
public class div {

	public static void main(String[] args) {
		
Scanner sc= new Scanner (System.in);
System.out.println("input the no.");
int n=sc.nextInt();int count=0;
while(n>=3)
{
	n=n/3;
	count++;
}
System.out.println(" "+count);
	}

}
