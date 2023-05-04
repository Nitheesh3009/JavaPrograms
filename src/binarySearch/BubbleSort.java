package binarySearch;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21,20,54,12,87,32};
//		System.out.println(sort(arr));
		System.out.println(Arrays.toString(arr));
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			boolean swap = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					 arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
				
			}
			if(swap==false) {
				break;
			}
		}
	}

}
