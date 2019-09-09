package String_Programming;
class Intern_Method{
	public static void main(String[] args) {
		String s=new String("You can't change me");
		String s1=new String("You can't change me");
		//System.out.println(s==s1);
	
		String s11=s.intern();
		System.out.println(s11==s1);
		System.out.println(s==s11);
		String s7=s1;
		System.out.println(s1==s7);
		System.out.println(s==s7);
		System.out.print(s7);
		
		System.out.println();
		System.out.println();
		
		String s8="You can't change me";
		
		System.out.println(s7==s8);
		System.out.println();
		//System.out.println(s8==s5);
		//System.out.println(s==s5);
		
		String s9="You can't"+" change me";
		System.out.println(s9==s8);
		System.out.println(s7==s9);
	//	System.out.println(s9==s5);
		
		String s10=s9.intern();
		System.out.println(s9==s10);
		System.out.println(s10==s8);
		System.out.println(s7==s10);
		
    }
}
