package String_Programming;
import java.util.Scanner;
public class String_Revese_Builder {
	private static Scanner scanner;
	public static void main(String ...args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the string :");
		/*StringBuffer sBuffer=new StringBuffer();
		sBuffer.append(scanner.nextLine());
		System.out.println(sBuffer.reverse());*/
		
		String string=scanner.nextLine();
		char[] a=string.toCharArray();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[a.length-i-1]);
		}
		
	}
}
