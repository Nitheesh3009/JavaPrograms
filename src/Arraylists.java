import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(13);
		list.add(54);
		list.add(767);
		list.add(25);
		
		list.set(0,87);
		System.out.println(list.contains(54));
		System.out.println(list);
		list.remove(2);
		
		//getting item at index 2, same as arr[2];
		System.out.println(list.get(2));
//		for(int i=0;i<5;i++) {
//			list.add(scan.nextInt());
//		}
//		
	}

}
