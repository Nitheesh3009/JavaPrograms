package binarySearch;

public class Bsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,12,15,25,27,34,65,76,98};
		int target = 60;
		int ans = search(arr, target);
		System.out.println(ans);
	}
	static int search(int[] arr,int target) {
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
		
		return -1;
		
	}

}
