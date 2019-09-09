package InfixToPrefix;
import java.util.*;
public class inTopre {
	private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		System.out.println("Enter the INFIX Expression");
		String exp=s.nextLine();
		System.out.println("Entered INFIX Expression is "+exp);
		System.out.println("its Equvalent PREFIX Expression is "+infixToprefix(exp));
	}
	static StringBuilder infixToprefix(String exp) {
		StringBuilder result=new StringBuilder();
		StringBuilder input=new StringBuilder(exp);
		input.reverse();
		
		Stack<Character> stack=new Stack<Character>();
		char[] charexp=new String(input).toCharArray();
		
		for(int i=0;i<charexp.length;i++) {
			char c=charexp[i];
			//if its an operater it check the precedense accordingly it pops//
			if(Precedence(c)>0){
				while (stack.isEmpty()==false && Precedence(stack.peek())>(Precedence(c))) {
					result.append(stack.pop());
				}
				stack.push(c);
			}
			//if it ends with )
			else if (c=='(') {
				char x=stack.pop();
				
				while(x!=')') {
					result.append(x);
					x=stack.pop();
				}
			}
			//if its strts with )
			else if (c==')') {
				stack.push(c);
			}
			//for charecters
			else {
				result.append(c);
			}
		}

		while(stack.isEmpty()!=true) {
			result.append(stack.pop());
		}

		return result.reverse();
	}
	
	static int Precedence(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
		case '$':
			return 3;
		}
	return -1;
	}

}