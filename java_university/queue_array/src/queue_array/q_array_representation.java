package queue_array;
import java.util.Scanner;
class Queue
 {
	static int frnt;
	static int rear;
	int Q[]=new int[5];
	Queue()
	{
		frnt=rear=-1;
	}
  void input_array(int Q[])
  {
	  Scanner sc= new Scanner(System.in);
	  	System.out.println("Please input the array of size 5");
	  	for(int i=0;i<=Q.length;i++)
	  	{
	  		Q[i]=sc.nextInt();
	  	}
  }
 public static void insert(int Q[])
  {
	  int max = Q.length;
	  if(rear==max-1)
	  {
		  System.out.println("Overflow");
	  }  
	  return;
	  
  }  
 
  void delete(int []Q)
  {
	  if(frnt==-1&&rear==-1)
	  {
		  System.out.println("Underflow");
	  }
	  return;
	  
  }
  void display(){
	  for(int i=frnt;i<rear;i++)
	  {
		  System.out.println(Q[i]+" ");
	  }
  }
}
 public class q_array_representation{
	 public static void main(String[] args) {
			
	      Scanner sc = new Scanner (System.in);
	      Queue ob= new Queue();
	      int choice;
	      int[] Q = null;
	      while(true)
	      {
	    	  System.out.println("Queue_Array Repretetion choice");
	    	  System.out.println("Please choose one");
	    	  System.out.println("0:-Exit");
	    	  System.out.println("1:-Create");
	    	  System.out.println("2:-Display");
	    	  System.out.println("3:-Insert");
	    	  System.out.println("4:-Delete");
	    	  choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 0:
	    	  System.exit(0);
	    	  case 1:
	    	  ob.input_array(Q);
	    	  break;
	    	  case 2:
	    	  ob.display();
	    	  break;
	    	  case 3:
	    	  ob.insert(Q);;
	    	  break;
	    	  case 4:
	    	  ob.delete(Q);
	    	  break;
	    	  default:
	    	  System.out.println("Sorry wrong choice"); 
	    	  }
	    	  
	      }
		}

	}


	 
 