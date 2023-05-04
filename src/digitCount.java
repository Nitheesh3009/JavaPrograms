
public class digitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,43,542,54322,3432,1};
		System.out.println(findeven(arr));
		
	}

	 static int findeven(int[] arr) {
		// TODO Auto-generated method stub
		 int count = 0;
		 for(int nums:arr) {
			 if(even(nums)) {
				 count++;
			 }
		 }
		return count;
	}

	 static boolean even(int nums) {
		// TODO Auto-generated method stub
		 int num = digits2(nums);
		 
		return num % 2 ==0;
	}
	 //finding number of digits using math function
	  static int digits2(int num) {
	        if (num < 0) {
	            num = num * -1;
	        }
	        return (int)(Math.log10(num)) + 1;
	    }
	  
	private static int numb(int arr) {
		// TODO Auto-generated method stub
		if(arr==0) {
			return 1;
		}
		
		int c=0;
		while(arr>0) {
			c++;
			arr/=10;
		}
		return c;
	}

}
