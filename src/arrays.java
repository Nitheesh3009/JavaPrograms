import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr2d = new int[3][2];
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				arr2d[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<arr2d.length;i++) {
			System.out.println(Arrays.toString(arr2d[i]));
			
			
//			for(int j=0;j<arr2d[i].length;j++) {
//				System.out.print(arr2d[i][j] + " ");
//			}
//			System.out.println( );
		}
		for(int[] a:arr2d) { //each row is an array in this 
			System.out.println(Arrays.toString(a));
		}
	}
}
