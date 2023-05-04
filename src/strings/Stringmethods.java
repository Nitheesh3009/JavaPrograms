package strings;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "John";
		StringBuilder sb = new StringBuilder();
//		sb = "My name is";
		String str1 = str.concat(" anb");
		System.out.println(str1);
		//it gives the unicode/Ascii value here
		System.out.println(str.codePointAt(0));
		//checks whether the letter is present or not
		System.out.println(str.contains("o"));
		System.out.println(str1.replace("n", "m"));
		//this gives me a array of strings 'by giving all the strings 
		//seperated by space, we need to Arrays,toSring to print the values
		System.out.println(Arrays.toString(str1.split(" ")));
	}

}
