import java.util.Arrays;
import java.util.Scanner;

public class Swaparray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int s = 0;
		int e = arr.length-1;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Before swapping");
		for(int i: arr) {
			System.out.println(i);
		}
//		swap(arr, 2,3);
//		System.out.println("After swapping" + Arrays.toString(arr));
		//max(arr);
		reverse(arr,s,e);
		System.out.println("reverse string" + Arrays.toString(arr));
	}

	private static void reverse(int[] arr, int s,int e) {
		// TODO Auto-generated method stub
		while(s<e) {
			swap(arr,s, e);
			s++;
			e--;
		}
	}

	private static void max(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max" + max);
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println("asdasd");
	}
}
