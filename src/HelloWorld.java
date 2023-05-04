import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//arr of primitives
		int[] arr = new int[5];
//		arr[0] = 12;
//		System.out.println(arr[]);
//		for(int i=0;i<5;i++) {
//			arr[i] = scan.nextInt();
//			
//		}
		System.out.println(arr); //printing address of arr
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int a:arr) { //for each loop
			System.out.println(a);
		}
		
		//we can also print using Arrays tostring method
		
		System.out.println(Arrays.toString(arr));
		
//		System.out.println(arr[5]); array index out of bound error
		
		
		// array of objects
		String[] str = new String[4];
		for(int i=0; i<str.length;i++) {
			str[i] = scan.next();
		}
		System.out.println(Arrays.toString(str));
	}

}
