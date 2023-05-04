import java.util.Arrays;

public class arraySearch2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{23,43,54},
				{54,76,12},
				{32,65,76}
		};
		int target = 32;
		int[] arr1 = search2d(arr, target);
		System.out.println("max is " + max(arr));
		System.out.println(Arrays.toString(arr1));
	}

	  static int max(int[][] arr) {
		// TODO Auto-generated method stub
		int m = arr[0][0];
//		for(int i=0;i<arr.length;i++) {
//			for( int j=0;j<arr[i].length;j++) {
//				if(m < arr[i][j]) {
//					m = arr[i][j];
//				}
//			}
//		}return m;
		for(int[] a1:arr) {
			for(int a2:a1) {
				if(m<a2) {
					m = a2;
				}
			}
		} return m;
	}

	static int[] search2d(int[][] arr, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for( int j=0;j<arr[i].length;j++) {
				if(target == arr[i][j]) {
					return new int[] {i, j};
				}
			}
		} return new int[] {-1,-1};
	}

}
