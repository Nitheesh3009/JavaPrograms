import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//intialization and we are adding some empty lists here and we will add values below
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list.get(i).add(scan.nextInt()); //gets the list based on i and will add values
			}
		}
		
		System.out.println(list);
		

	}

}
