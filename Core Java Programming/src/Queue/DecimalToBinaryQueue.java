package Queue;
import java.util.*;
public class DecimalToBinaryQueue {
	private static Scanner scanner;
	static Queue<Integer> q=new LinkedList<Integer>();
	static Stack<Integer> stack=new Stack<Integer>();
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.print("Enter the Decimal: ");
		int Decimal=scanner.nextInt();
		Convert(Decimal);
	}
	static void Convert(int Decimal) {
		while(Decimal>0) {
			int temp=Decimal%2;
			q.add(temp);
			Decimal/=2;
		}
		toStack();
	}
	
	static void toStack() {
		while(q.isEmpty()!=true) {
			stack.push(q.poll());
		}
		toQueue();
	}
	
	static void toQueue() {
		while(stack.isEmpty()!=true) {
			q.add(stack.pop());
		}
		Print();
	}
	
	static void Print() {
		while(q.isEmpty()!=true) {
			System.out.print(q.poll());
		}
	}

}
