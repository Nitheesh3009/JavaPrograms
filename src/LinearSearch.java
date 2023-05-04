
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[6];
		int[] arr = {1,2,3,4,5,6};
		int target = 6;
		int ans = linearSearch( arr, target);
		System.out.println(ans);
	}

	private static int linearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return -1;
		}
			for(int i=0; i<arr.length;i++) {
				if(arr[i] == target) {
					return i;
				}
			}
		
		return -1;
	}
	

}
