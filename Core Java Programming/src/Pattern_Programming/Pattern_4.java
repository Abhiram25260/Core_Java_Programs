package Pattern_Programming;
import java.util.*;
public class Pattern_4 {
	public static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		System.out.println("Enter the number of Sapces :");
		int n=s.nextInt();
		for(int i=0;i<5;i++) {
			for (int j = 0; j <n+5; j++) {
				if(j<n) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
