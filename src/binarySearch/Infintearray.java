package binarySearch;

//suppose we don;t know the size of the arry and we should not use arr.length function
public class Infintearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,12,23,34,56,79,87,92,94,97};
		int target = 56;
		System.out.println(search(arr,target));

	}

	 static int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s =0;
		int e = 1;
	
		while(target>arr[e]) {
			int ns = e+1;
			e = e + (e-s+1)*2;
			s = ns;
		}
		
		
	return infintesearch(arr, target, s,e);
	 }

	 static int infintesearch(int[] arr, int target, int s, int e) {
		// TODO Auto-generated method stub
		while(s<=e) {
			int mid = (s+e)/2;
			if(target<arr[mid]) {
				e = mid -1;
			}else if(target>arr[mid]) {
				s = mid+1;
			}else return mid;
	}
		return -1;
}
}
