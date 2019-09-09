package Numer_Problems;
public class Swapping {
	public static void main(String ...args) {
		int a=961;
		int b=1;
		System.out.print("Using Multiplication and Division operation \t");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a= "+a+"\tb= "+b);
		System.out.print("Using XOR operation\t\t\t\t");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a+"\tb= "+b);
		System.out.print("Using Addition and subtraction operation\t");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a+"\tb= "+b);
	}

}
