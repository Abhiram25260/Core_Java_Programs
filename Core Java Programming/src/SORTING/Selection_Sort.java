package SORTING;
import java.util.*;
public class Selection_Sort {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		int[] arr=new int[10]; 
		System.out.println("Enter the Array Elements(10): ");
		for(int i=0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		bubble_sort(arr);
		System.out.println("AFTER THE SELECTION SORT THE SORTED ELEMENTS ARE:");
		display(arr);
	}
	static void bubble_sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for (int j = i+1; j<n; j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			/*arr[min_index]=arr[min_index]^arr[i];
			arr[i]=arr[min_index]^arr[i];
			arr[min_index]=arr[min_index]^arr[i];
			*/
			arr[min_index]=arr[i]+arr[min_index];
			arr[i]=arr[min_index]-arr[i];
			arr[min_index]=arr[min_index]-arr[i];
			/*
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;*/
		}
	}
	static void display(int[] arr) {
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
