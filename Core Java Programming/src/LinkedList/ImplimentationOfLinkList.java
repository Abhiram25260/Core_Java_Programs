package LinkedList;
import java.util.*;
public class ImplimentationOfLinkList {
	private static Scanner scanner;
	static LinkedList<Integer> llIntegers=new LinkedList<>();
	public static void main(String ...arg) {
		scanner=new Scanner(System.in);
		while(true) {
		System.out.println("PRESS 1 TO INSERT_FRONT");
		System.out.println("PRESS 2 TO INSERT_REAR");
		System.out.println("PRESS 3 TO INSERT_AT_INDEX");
		System.out.println("PRESS 4 TO DELETE_FRONT");
		System.out.println("PRESS 5 TO DELETE_REAR");
		System.out.println("PRESS 6 TO DELETE_AT_INDEX");
		System.out.println("PRESS 7 TO VIEW");
		System.out.println("PRESS 8 TO STOP");
		System.out.print("Enter your Choice:");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			insert_Front();
			break;
		case 2:
			insert_Rear();
			break;
		case 3:
			insert_At_Index();
			break;
		case 4:
			delete_Front();
			break;
		case 5:
			delete_Rear();
			break;
		case 6:
			delete_At_Index();
			break;
		case 7:
			View();
			break;
		default:
			System.exit(0);
			break;
		}
		}
	}
	//INPUT FUNCTION THAT WILL RETURN INPUT FOR NEW NODE
	static int input() {
		System.out.println("Enter the Element :");
		int item=scanner.nextInt();
		return item;
	}
	//INDEX FUNCTION THAT WILL RETURN INDEX IN WHICH OPERATION IS TO BE DONE
	static int index() {
		System.out.println("ENter the Index");
		int index=scanner.nextInt();
		return index;
	}
	//FOR INSERTING AT FRONT
	static void insert_Front() {
		llIntegers.addFirst(input());
	}
	//FOR INSERTING AT THE END
	static void insert_Rear() {
		llIntegers.addLast(input());
	}
	//FOR INSERTING AT SPECIFIED INDEX
	static void insert_At_Index() {
		llIntegers.add(index(),input());
	}
	//FOR DELETING ELEMENT FROM THE FIRST
	static void delete_Front() {
		llIntegers.removeFirst();
	}
	//FOR DELETING ELEMENT FROM THE LAST
	static void delete_Rear() {
		llIntegers.removeLast();
	}
	//FOR DELETING ELEMENT FROM THE LAST
	static void delete_At_Index() {
		llIntegers.remove(index());
	}
	//FOR DELETING ELEMENT FROM THE LAST
	static void View() {
		for(int a:llIntegers) {
			System.out.print(a+"\t");
		}
	}
}
