package Numer_Problems;
import java.util.*;
public class Number_Of_Divisors {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		int num,count=0;
		while(true) {
			System.out.println("Enter the number");
			num=scanner.nextInt();
			if(num>0) {
				break;
			}
		}
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
