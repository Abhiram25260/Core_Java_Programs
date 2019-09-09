package Pattern_Programming;
public class Pattern_12 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1 || k==2*i-1 && i!=5) {
					System.out.print(k);
				}
				else if(i==5) {
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=4;i>0;i--) {
			for(int j=0;j<5-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1 || k==2*i-1) {
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
