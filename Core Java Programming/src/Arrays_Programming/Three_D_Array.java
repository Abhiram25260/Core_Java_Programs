//THREE- DIMENSIONAL JACGGED ARRAY
package Arrays_Programming;

import java.util.Scanner;

public class Three_D_Array {

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int a[][][]=new int[2][][];
		a[0]=new int[2][];
		a[1]=new int[3][];
		a[0][0]=new int[8];
		a[0][1]=new int[7];
		a[1][0]=new int[6];
		a[1][1]=new int[5];
		a[1][2]=new int[4];
		
		int i,j,k;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the Elements "+"a["+i+"]["+j+"]["+k+"]");
					a[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("The Elements are:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("The Eelements of "+"a["+i+"]["+j+"]["+k+"]"+a[i][j][k]);
				}
			}
		}

	}

}
