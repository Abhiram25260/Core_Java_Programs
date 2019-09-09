package LinearEquation;
import java.util.*;
public class Equation2 {
	private static Scanner scanner;
	public static void main(String ...args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the Value for (A,B,C,D,E,F)");
		double a[]=new double[6];
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextDouble();
		}
		double temp=((a[0]*a[4])-(a[3]*a[1]));
		if(temp!=0) {
			double x,y;
			x=((a[1]*a[5])-(a[4]*a[2]))/temp;
			y=((a[2]*a[3])-(a[5]*a[0]))/temp;
			System.out.println("The Value of X: "+x+"\nThe Value of Y: "+y);
		}
		else {
			System.out.println("VALUE OF X AND Y cant be found");
		}
		
	}

}
