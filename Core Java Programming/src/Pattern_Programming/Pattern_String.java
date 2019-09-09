package Pattern_Programming;
public class Pattern_String {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=7;i++) {
			for(int j=0;j<7-i+1;j++) {
				System.out.print(" ");
				}
			if(i%2!=0) {
				for(int k=0;k<2*i-1;k++) {
					System.out.print(" "+cal(count));
					count++;
					}
				}
			else {
				count+=2*i-2;
				for(int k=0;k<2*i-1;k++) {
					System.out.print(" "+cal(count));
					count--;
					}
				count+=2*i;
				}
			System.out.println();
			}
		}
	static char cal(int count) {
		String string="abc";
		int temp=count%3;
		if(temp==0)
			return string.charAt(2);
		else
			return string.charAt(temp-1);
		}
	}