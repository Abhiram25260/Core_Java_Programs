package String_Programming;
import java.util.*;
public class Char_Occur_Frequency {
	private static Scanner scanner;
	public static void main(String ...args) {
		scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String string=scanner.nextLine();
		System.out.print("Enter the char");
		char ch=scanner.next().charAt(0);
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
