package Stack;
import java.util.*;
public class StringRevWbyW {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scanner.nextLine();
		str=str.toLowerCase();
		//System.out.println(str);
		Stack<Character> stack=new Stack<Character>();
		StringBuilder sBuilder=new StringBuilder();
		String[] a=str.split(" ",0);
	
		for(String k:a) {
			
		char[] X=k.toCharArray();
		for(int i=0;i<X.length;i++) {
			if(i==X.length-1) {
				X[i]=Character.toUpperCase(X[i]);
				stack.push(X[i]);
			}
			else {
				stack.push(X[i]);
			}
			
		}
		
		while(stack.isEmpty()!=true) {
			sBuilder.append(stack.pop());
		}
		sBuilder.append(" ");
		}
		
		System.out.println(sBuilder);
	}

}
