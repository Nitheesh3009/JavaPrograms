package binarySearch;

public class FloorandCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,5,12,15,25,27,34,65,76,98};
		int target = 60;
		int ans = floor(arr, target);
		int ans1 = ceiling(arr, target);
		System.out.println("floor" + ans);
		System.out.println("ceiling" + ans1);
	}
	//floor is the greatest number smaller than target
	static int floor(int[] arr,int target) {
		if(target<arr[0]) {
			return -1;
		}
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(target<arr[mid]) {
				end = mid - 1;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		
		return end;
		
	
	}
	static int ceiling(int[] arr,int target) {
		
		int start =0;
		int end = arr.length-1;
		if(target>arr[end]) {
			return -1;
		}
		while(start<=end) {
			int mid = (start+end)/2;
			if(target<arr[mid]) {
				end = mid - 1;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		
		return start;
		
	
	}

}
