package linked_list;
import java.util.*;
class Node
{
	int info;
	Node link;
}
public class input_link {
	public static Node create(Node start)
	{
		Node p = new Node ();
		Scanner sc = new Scanner (System.in);
		System.out.println("inut info part");
		p.info=sc.nextInt();
		p.link=null;
		start = p;
		System.out.println("do u want to add no. (1/0)");
		int y = sc.nextInt();
		while(y==1)
		{
		Node q = new Node();
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
	public static void display(Node start)
	{
		Node p = start;
		while(p!=null)
		{
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
	}

	public static void main(String[] args) {
		
        Node start = null;
        start = create(start);
        display(start);
        
	}

}
