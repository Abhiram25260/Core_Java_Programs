package Queue;
import java.util.*;
public class SearchaKeyQueue {
	private static Scanner scanner;
	static Queue<Integer> queue=new LinkedList<>();
	static Stack<Integer> stack=new Stack<Integer>();
	public static void main(String ...args) {
		scanner=new Scanner(System.in);
		while(true) {
			System.out.println("\nEnter your chioice:");
			System.out.println("PRESS 1 TO INSERT");
			System.out.println("PRESS 2 TO DELETE:");
			System.out.println("PRESS 3 TO VIEW:");
			System.out.println("PRESS 4 TO SEARCH:");
			System.out.println("PRESS 5 TO EXIT:");
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
				Insert();
				break;
			case 2:
				Delete();
				break;
			case 3:
				View();
				break;
			case 4:
				Search();
				break;
				
			default:
				System.exit(0);
				break;
			}
		}
	}
	static void Insert() {
			System.out.println("\nEnter the Element: ");
			queue.add(scanner.nextInt());
	}
	
	static void Delete() {
		if(queue.isEmpty()==true) {
			System.out.println("\nDeletion not possible");
		}else {
			System.out.println("\n\n"+queue.peek()+" is been deleted");
			queue.poll();
		}
	}
	
	static void View() {
		if(queue.isEmpty()==true) {
			System.out.println("\nView not possible");
		}else {
			while(queue.isEmpty()!=true) {
				System.out.print(queue.poll()+"\t");
			}
		}
	}
	
	static void Search() {
		if(queue.isEmpty()==true) {
			System.out.println("\nView not possible");
		}else {
			System.out.println("\nEnter the Enter the Key to Search");
			int key=scanner.nextInt();
			while(queue.isEmpty()!=true) {
				int temp=queue.poll();
				if(key==temp) {
					System.out.println(temp+" Key found");
					break;
				}
			}
		}
	}

}
