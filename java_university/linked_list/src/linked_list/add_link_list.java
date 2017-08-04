package linked_list;
import java.util.*;
class Node1
{
	int info;
	Node1 link;
}
public class add_link_list {
	public static Node1 create(Node1 start)
	{
		Node1 p = new Node1 ();
		Scanner sc = new Scanner (System.in);
		System.out.println("inut info part");
		p.info=sc.nextInt();
		p.link=null;
		start = p;
		System.out.println("do u want to add no. (1/0)");
		int y = sc.nextInt();
		while(y==1)
		{
		Node1 q = new Node1();
		System.out.println("inut info part");
		q.info=sc.nextInt();
		q.link=null;
		p.link=q;
		System.out.println("do u want to add no. (1/0)");
		y = sc.nextInt();
		}
		return start;		
	}
	public static int display(Node1 start)
	{   int sum =0,count =0;
		Node1 p = start;
		while(p!=null)
		{
			
		  count++;
		  p=p.link;	
		
		}
		return (count);
	}

	public static void main(String[] args) {
		
        Node1 start = null;
        start = create(start);
        display(start);
        
	}

}


	
	