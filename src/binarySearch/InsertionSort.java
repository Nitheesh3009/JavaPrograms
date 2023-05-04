package binarySearch;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {-5,4,3,1,2};
		sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<=arr.length-2;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp = arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = temp;
		
	}

}
