package assin7;
import java.util.Scanner;
public class Queue_array {

	
	public static boolean is_empty() {
		if(front==-1&&rear==-1)
			return true;
		else
			return false;
	}

	public static boolean is_full() {
		if(rear==MAX-1)
			return true;
		else
			return false;
	}

	public static void insert(int Q[]) {
		int MAX = Q.length;
		if(is_full()) {
			System.out.println("Overflow");
			return;
		}
		if(front==-1&&rear==-1)
			front=rear=0;
		else
			rear++;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element");
		int ele = sc.nextInt();
		Q[rear]=ele;
	}

	public static void delete(int Q[]) {
		if(is_empty()) {
			System.out.println("Underflow");
			return;
		}
		if(front==rear)
			front=rear=-1;
		else
			front++;
	}

	public static void display(int Q[]) {
		for(int i=front;i<=rear;i++)
			System.out.print(Q[i] + " ");
	}

public static final int MAX = 5;
public static int front = -1;
public static int rear = -1;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int queue[]=new int[MAX];
	while(true) {
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("4: Check if queue is empty");
		System.out.println("5: Check if queue is full");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 0:
			System.exit(0);
		case 1:
			insert(queue);
			break;
		case 2:
			delete(queue);
			break;
		case 3: display(queue);
		break;
		case 4: 
			if(is_empty()==true)
				System.out.println("Yes");
			else
				System.out.println("No");
			break;
		case 5: 
			if(is_full()==true)
				System.out.println("Yes");
			else
				System.out.println("No");
		break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
}

