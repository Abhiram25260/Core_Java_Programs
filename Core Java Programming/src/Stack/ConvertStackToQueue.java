package Stack;
import java.util.*;
public class ConvertStackToQueue {
	private static Scanner scanner;
	private static Stack<Integer> s1=new Stack<Integer>();
	private static Stack<Integer> s2=new Stack<Integer>();
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		while(true) {
			System.out.println("\nENter the Choice :");
			System.out.println("PRESS 1 TO INSERT");
			System.out.println("PRESS 2 TO VIEW");
			System.out.println("PRESS 3 TO EXIT");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				Insert();
				break;
			case 2:
				View();
				break;
				
			default:
				System.exit(0);
				break;
			}
		}
		
	}
	
	static void Insert() {
		System.out.print("ENter the Element : ");
		s1.push(scanner.nextInt());
	}
	
	static void View() {
		while(s1.isEmpty()!=true) {
			s2.push(s1.pop());
		}
		if(s2.isEmpty()!=true) {
			while(s2.isEmpty()!=true) {
				System.out.print(s2.pop()+"\t");
			}
		}else {
			System.out.println("View Not Possible");
		}
	}

}
