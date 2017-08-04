package satck_linked_list;
import java.util.Scanner;
class node
{
	int info;
	node link;
}

public class push_pop_ll {
	
	public static node create(node top)
	{
		node p = new node ();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input the info_part");
		p.info=sc.nextInt();
		p.link=null;
		top=p;
		System.out.println("Do u want to add more (1/0)");
		int op=sc.nextInt();
		while(op==1)
		{
			node q = new node();
			System.out.println("Please input the info_part");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("Do u want to add more (1/0)");
		    op =sc.nextInt();
		}
		return top;
		
	}
	public static void display(node top)
	{
		node p=top;
		while(p!=null)
		{
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
	}
	@SuppressWarnings("resource")
	public static node push_ll_beg(node top)
	{
		node p = new node ();
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the info_part to be pushed");
		p.info=sc.nextInt();
		p.link=top;
		top=p;
		return top;
	}
	@SuppressWarnings("resource")
	public static node pop_ll_del(node top)
	{   Scanner sc = new Scanner (System.in);
		System.out.println("Do u really want to delete the beggining one (1/0)");
		int op=sc.nextInt();
		if(op==1)
		if(top==null)
		{
			System.out.println("underflow");
			return top;
		}
		top=top.link;
		return top;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
      Scanner sc = new Scanner (System.in);
      int choice;
      node top=null;
      while(true)
      {
    	  System.out.println("Linked_List Repretetion choice");
    	  System.out.println("Please choose one");
    	  System.out.println("0:-Exit");
    	  System.out.println("1:-Create");
    	  System.out.println("2:-Display");
    	  System.out.println("3:-Push");
    	  System.out.println("4:-Pop");
    	  choice=sc.nextInt();
    	  switch(choice)
    	  {
    	  case 0:
    	  System.exit(0);
    	  case 1:
    	  top=create(top);
    	  break;
    	  case 2:
    	  display(top);
    	  break;
    	  case 3:
    	  top=push_ll_beg(top);
    	  break;
    	  case 4:
    	  top=pop_ll_del(top);
    	  break;
    	  default:
    	  System.out.println("Sorry wrong choice"); 
    	  }
    	  
      }
	}

}

