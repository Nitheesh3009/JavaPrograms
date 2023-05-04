
public class StringLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Nitheesh";
		char target = 'i';
		System.out.println(search( name,  target));
	}

	private static boolean search(String name, char target) {
		// TODO Auto-generated method stub
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(target == name.charAt(i)) {
				return true;
			}
		}
//		for (char s : name.toCharArray()) {
//			if(s == target) {
//				return true;
//			} return false;
//		}
		
		
		return false;
	}

}
