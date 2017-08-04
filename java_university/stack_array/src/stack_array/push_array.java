package stack_array;
import java.util.Scanner;
public class push_array {
	public static int push(int ele,int top,int stack[])
	{  
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input the value to be pushed");
		top=sc.nextInt();
		if(top==stack.length-1){
			System.out.println("Underflow");        	
			return top;
		}
		top++;
		stack[top]=ele;
		return top;
	}
	public static void main(String[] args){
	int top=-1;int i=0;final int max=5;
	int stack[]=new int[max];
	Scanner sc = new Scanner (System.in);
	System.out.println("input the array");
	while(i!=stack.length)
	{
		stack[i]=sc.nextInt();
		i++;
	}
	top=push(0,top, stack);
	for(int j=0;j<=stack.length;j++)
	{
		System.out.println("the array created is"+stack[j]);
	}
	}
}
