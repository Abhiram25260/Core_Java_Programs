package String_Programming;

import java.util.Scanner;
public class First_letter_Capital {
	private static Scanner scanner;
	public static void main(String ...args) {
		System.out.println("Eneter the String :");
		scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		string=string.toLowerCase();
		String []s1=string.split(" ",0);
		for(String k:s1) {
			for(int i=0;i<k.length();i++) {
				if(i==0) {
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
