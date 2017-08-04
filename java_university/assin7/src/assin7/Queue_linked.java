package assin7;
import java.util.Scanner;

class Node {
	int info;
	Node next;
}

public class Queue_linked {

	
	public static Node insert(Node rear, Node front) {
		Node p = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data - ");
		p.info = sc.nextInt();
		p.next = null;
		if(front==null) {
			front=rear=p;
		} else {
			rear.next = p;
			rear = p;
		}
		return front;
	}

	public static Node delete(Node rear, Node front) {
		if(front==null&&rear==null) {
			System.out.println("Underflow");
			return front;
		}
		if(front.next==null) {
			front=rear=null;
		} else {
			front = front.next;
		}
		return front;
	}

	public static void display(Node rear, Node front) {
		Node p = front;
		while(p!=null) {
			System.out.print(p.info + " ");
			p = p.next;
		}
	}


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Node rear,front;
	rear=front=null;
	while(true) {
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 0:
			System.exit(0);
		case 1:
			front = insert(rear,front);
			break;
		case 2:
			front = delete(rear,front);
			break;
		case 3: display(rear,front);
		break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
}

