
public class RichestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] persons = {{1,2,3},{2,3,3},{4,2},{1,5,2,3}};

		System.out.println(richest(persons));
}

	 static int richest(int[][] persons) {
		// TODO Auto-generated method stub
		 int n = 0 ;
		
		for(int i=0;i<persons.length;i++) {
			 int sum = 0;
			for(int j=0;j<persons[i].length;j++) {
				sum = sum + persons[i][j];
			}
			if(sum>n) {
				n = sum;
			}
		}
		return n;
	}

}