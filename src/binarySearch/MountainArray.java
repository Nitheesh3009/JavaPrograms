package binarySearch;


/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
public class MountainArray {
	public static void main(String[] args) {
		int[] mArr = {1,2,3,4,5,3,1};
		int target = 5;
		int ans = search(mArr, target);
		System.out.println(ans);
	}
	
   
    public static int search(int[] arr, int target){
        int peak = findpeak(arr);
        int start = 0;
        int end = arr.length-1;
        int ans = orderSearch(arr,target,start,peak);
        if(ans!=-1){
            return ans;
        }else{
            int ans1 = orderSearch(arr,target,peak,end);
            return ans1;
        }

        
    }
    static int findpeak(int[] arr1){
            int start = 0;
            int end = arr1.length-1;
            while(start<end){
                int mid = (start+end)/2;
                if(arr1[mid]>arr1[mid+1]){
                    end = mid;
                }else{
                    start = mid+1;
                }

            }return start;
    }
    static int orderSearch(int[] arr,int target, int start, int end) {
	
		boolean isAsc; //boolean isAsc = arr[start]<arr[end];
		if(arr[start]<arr[end]) {
			isAsc =true;
		}
		else {
			isAsc = false;
		}
		while(isAsc) {
		while(start<end) {
			int mid = (start+end)/2;
			if (arr[mid] == target) {
                return mid;
            }
			if(target<arr[mid]) {
				end = mid - 1;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		
		return -1;}
		while(start<end) {
			int mid = (start+end)/2;
			if(target>arr[mid]) {
				end = mid - 1;
			}else if(target<arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}