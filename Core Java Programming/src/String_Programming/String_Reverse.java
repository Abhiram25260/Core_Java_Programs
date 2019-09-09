package String_Programming;
import java.util.Scanner;
public class String_Reverse {
	private static Scanner s;
	public static void main(String ...args) {
		s=new Scanner(System.in);
		System.out.println("Enter the String to be Reverse:");
		String string=s.nextLine();
		string=string.toLowerCase();
		String[] string_Array=string.split(" ",0);
		for(String k : string_Array) {
			for(int i=k.length()-1;i>=0;i--) {
				if(i==k.length()-1){
					System.out.print(k.toUpperCase().charAt(i));
				}
				else {
					System.out.print(k.charAt(i));
				}
			}
			System.out.print(" ");
		}
	}
}
