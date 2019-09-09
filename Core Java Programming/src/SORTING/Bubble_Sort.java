package SORTING;
import java.util.*;
public class Bubble_Sort {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		int[] arr=new int[10]; 
		System.out.println("Enter the Array Elements(10): ");
		for(int i=0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		bubble_sort(arr);
		System.out.println("AFTER THE BUBBLE SORT THE SORTED ELEMENTS ARE:");
		display(arr);
	}
	static void bubble_sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for (int j = 0; j <n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
	}
	static void display(int[] arr) {
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
