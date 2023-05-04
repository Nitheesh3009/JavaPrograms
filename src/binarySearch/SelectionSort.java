package binarySearch;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,3,14,54,23};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int max = findMax(arr,0,last);
//				System.out.println(max);
			Swap(arr,max, last);
		}
	}

	private static void Swap(int[] arr, int max, int last) {
		// TODO Auto-generated method stub
		int temp = arr[max];
		arr[max] = arr[last];
		arr[last] = temp;
	}

	private static int findMax(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		int max = start;
		for(int i=start;i<=last;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
			start++;
		}
		return max;
	}

}
