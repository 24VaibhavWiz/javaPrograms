package linked_list;

import java.util.Scanner;

class Node11
{
	int info;
	Node11 link;
}
public class insbeg  {
	public static Node11 create(Node11 start)
	{
		Node11 p = new Node11 ();
		Scanner sc = new Scanner (System.in);
		System.out.println("inut info part");
		p.info=sc.nextInt();
		p.link=null;
		start = p;
		System.out.println("do u want to add no. (1/0)");
		int y = sc.nextInt();
		while(y==1)
		{
		Node11 q = new Node11();
		System.out.println("inut info part");
		q.info=sc.nextInt();
		q.link=null;
		p.link=q;
		p=q;
		System.out.println("do u want to add no. (1/0)");
		y = sc.nextInt();
		}
		return start;
		
	}
	public static void display(Node11 start)
	{
		Node11 p = start;
		while(p!=null)
		{
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
	}
	public static Node11 insbegn(Node11 start)
	{ Scanner sc = new Scanner (System.in);
	  Node11 p = new Node11 ();
	  p.info=sc.nextInt();
	  p.link=null;p.link=start;
	  start = p;
	  return start;	  
	}

	public static void main(String[] args) {
        Node11
        start = null;
        start = create(start);
        display(start);
        insbegn(start);
	}

}
