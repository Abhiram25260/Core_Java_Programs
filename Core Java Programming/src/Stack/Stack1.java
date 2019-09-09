package Stack;
import java.util.*;
public class Stack1 {
	private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		int choice,top=-1,size=5;
		int []a=new int[5];
		while(true) {
			System.out.println("PRESS 1 to Push");
			System.out .println("PRESS 2 for Pop");
			System.out .println("PRESS 3 for Display");
			System.out .println("PRESS 4 for Exit");
			System.out .println("Enter your Choice");
			choice=s.nextInt();
			
			switch(choice){
				case 1:
					top=push(a,top,size);
					break;
				case 2:
					top=pop(a, top);
					break;
				case 3:
					Display(a, top);
					break;
				default:System.exit(0);
			}
			
		}
	}
	static int push(int a[],int top,int size) {
		s=new Scanner(System.in);
		int item;
		if(top==size-1) {
			System.out.println("Pushing an element not Possible");
		}
		else {
			System.out.print("Enter the element:-");
			item=s.nextInt();
			++top;
			a[top]=item;
		}
		return top;
	}
	
	static int pop(int a[],int top) {
		if(top==-1) {
			System.out.println("Pop operation not possible");
		}
		else {
			System.out.println("Element "+a[top]+" has been popped");
			--top;
		}
		return top;
	}
	
	static void Display(int a[],int top) {
		if(top==-1) {
			System.out.println("No elements to Display");
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.println("Element "+(i+1)+" is "+a[i]);
			}
		}
	}

}
