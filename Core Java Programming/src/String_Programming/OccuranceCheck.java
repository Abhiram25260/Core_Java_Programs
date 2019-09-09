package String_Programming;
import java.util.Scanner;
public class OccuranceCheck {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner =new Scanner(System.in);
		System.out.println("Enter the String :");
		String string=scanner.nextLine();
		//string=string.sort();
		int len=string.length();
		System.out.println(len);
		String temp="";
		int count=0;
		for(int i=0;i<len;i++) {
			char ch1=string.charAt(i);
			for(int j=i;j<len;j++) {
				char ch2=string.charAt(j);
				if(ch1==ch2 && temp.indexOf(ch1)== -1) {
					count++;
				}
			}
			if(temp.indexOf(ch1)== -1) {
				temp +=ch1;
				System.out.println("charecter  "+ch1+"  occurs "+count+" number of times");
			}
			count=0;
		}
	}
}
