package String_Programming;
import java.util.*;
public class Orting_Of_Strings {
	private static Scanner scanner;
	public static void main(String ...args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the Number od Sting to Sort:");
		int N=scanner.nextInt();
		int i;
		String strings[] = new String[N];
		//System.out.println("Enter names: ");
		for (i = 0; i <N; i++) {
			System.out.println("Enter name: ");
			strings[i] = scanner.nextLine();
		}
		
		
		Arrays.sort(strings);
		for(String k:strings) {
			System.out.println(k);
		}
		
	}

}
