package Queue;
import java.util.*;
public class Queue1 {
	private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		int choice,rear=-1,size=5,front=0;
		int []q=new int[5];
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("PRESS 1 to Insert");
			System.out .println("PRESS 2 for Delete");
			System.out .println("PRESS 3 for Display");
			System.out .println("PRESS 4 for Exit");
			System.out .println("Enter your Choice");
			choice=s.nextInt();
			
			switch(choice){
				case 1:
					rear=insert(q,rear,size);
					break;
				case 2:
					front=delete(q,rear,front);
					break;
				case 3:
					Display(q, rear,front);
					break;
				default:System.exit(0);
			}
			
		}
	}
	static int insert(int q[],int rear,int size) {
		s=new Scanner(System.in);
		int item;
		if(rear==size-1) {
			System.out.println("Inserting an element not Possible");
		}
		else {
			System.out.print("Enter the element:-");
			item=s.nextInt();
			++rear;
			q[rear]=item;
		}
		return rear;
	}
	
	static int delete(int q[],int rear,int front) {
		if(front>rear) {
			System.out.println("Deletion not possible");
		}
		else {
			System.out.println("Element "+q[front]+" has been Deleted");
			++front;
		}
		return front;
	}
	
	static void Display(int q[],int rear,int front) {
		if(front>rear) {
			System.out.println("No elements to Display");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println("Element "+(i+1)+" is "+q[i]);
			}
		}
	}

}