package strings;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s,indices));
	}
	
	 public static String restoreString(String s, int[] indices) {
	        String s1 = "";
	        int j=0;
	        for(int i=0;i<indices.length;i++){
	        	for(int k=0;k<indices.length;k++){
	             if(indices[k]==j){
	            s1 +=s.charAt(k);
	            j++;
	            break;
	        }
	        }
	        }
	       return s1;
	    }

}
