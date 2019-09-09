package String_Programming;
import java.util.*;
public class Annagram {
	private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		System.out.println("Enter the two string : ");
		String s1=s.nextLine();
		String s2=s.nextLine();
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		s1=String.valueOf(ch1);
		s2=String.valueOf(ch2);
		if(s1.equals(s2)) {
			System.out.println("ANNAGRAM");
		}
		else {
			System.out.println("NOT ANNAGRAM");
		}
	}

}
