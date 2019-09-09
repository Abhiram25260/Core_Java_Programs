package Stack;
import java.util.*;
public class StringReverse {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scanner.nextLine();
		
		Stack<Character> stack=new Stack<Character>();
		StringBuilder sBuilder=new StringBuilder();
		char[] a=str.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			stack.push(a[i]);
		}
		
		while(stack.isEmpty()!=true) {
			sBuilder.append(stack.pop());
		}
		
		System.out.println("Reversed String is :"+sBuilder);
	}

}
