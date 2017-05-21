package assin3;
import java.util.Scanner; 
public class partition {
	 static int i;static int j=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);int k;
		System.out.println("input the length of array");
		int a[]=new int[sc.nextInt()];
		System.out.println("input array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the input array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println(" input value of k");
		k=sc.nextInt();
		int i=a.length-1;
		partition_array(a,k);
		System.out.print("array after partition is ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	public static void partition_array(int a[],int k)
	{
		if((a[j]<=k)&&(j<i))
			j++;
		if((a[i]>k)&&(j<i))
			i--;
		if(j<i)
		{
			int temp =a[j];
			a[j]=temp;
			if(a[j]<=k)
				j++;
			if(a[i]>k)
				i--;
			partition_array(a,k);
		}
		
		
	}

}
