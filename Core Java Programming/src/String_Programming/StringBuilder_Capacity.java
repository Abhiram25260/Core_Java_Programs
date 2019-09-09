package String_Programming;

public class StringBuilder_Capacity {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		//StringBuilder s1;
		//System.out.println(s1==s);
		//s.ensureCapacity(70);
		System.out.println("Capacity="+s.capacity());
		System.out.println("Length of the String="+s.length());
		s.append("Hello");
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append("Abhiram How are you?");
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append("How is your stdies going on?");
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append("Abhiram How are you? What are you doing now? How is your stdies going on?A");
		System.out.println(s.capacity());
		System.out.println(s.length());
		

	}

}
