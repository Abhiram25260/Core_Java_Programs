package Pattern_Programming;
import java.util.*;
public class Pattern_3 {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
