
public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,93,76,45,87,34,23,9,23};
		max(arr);
		min(arr);
		
	}

	private static void max(int[] arr) {
		// TODO Auto-generated method stub
		int m1= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(m1>arr[i]) {
				m1 = arr[i];
			}
			
		}
		System.out.println(m1);
	}

	private static void min(int[] arr) {
		// TODO Auto-generated method stub
		int m2= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(m2<arr[i]) {
				m2 = arr[i];
			}
		}
		System.out.println(m2);
		
	}

}
