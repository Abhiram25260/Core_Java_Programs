package Stack;
import java.util.*;
public class pBalance {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scanner.nextLine();
		
		Stack<Character> stack=new Stack<Character>();
		char[] a=str.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]=='(') {
				stack.push(a[i]);
			}else if(a[i]==')') {
				stack.pop();
			}else {
				System.out.print("UNDEFINED Character FOUND");
			}
		}
		if(stack.isEmpty()!=false) {
			System.out.print(str+" is a Balance Parenthesis String");
		}else {
			System.out.print(str+" is NOT a Balance Parenthesis String");
		}
	}

}
