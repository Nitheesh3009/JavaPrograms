package binarySearch;

import java.util.*; 
import java.io.*;

class ArrayChallenge {

  public static String ArrayChallenge(int[] arr) {
    // code goes here 
    int profit = 0;
    int diff = 0;
    String str = "07kwgu8f";
    boolean flag=false;

    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
      if(arr[j]>arr[i]){
           diff = arr[j] - arr[i];
      }
      if(diff>profit){
        profit = diff;
      }
    }
    }
    String str1 = Integer.toString(profit);
    if(profit==0){
    return "-1";
  }else{
//    String str1 = Integer.toString(profit);
    for(int i=0;i<str1.length();i++){
      for(int j=0;j<str.length();j++){
        if(str1.charAt(i)==str.charAt(j)){
          flag =  true;
          break;
        }else{
          flag = false;
        }
      }
    }
  }
    if(flag) {
    	return "EMPTY";
    }else {
    	return str1;
    }
  }
  

//  public static void main (String[] args) {  
//    // keep this function call here     
//    Scanner s = new Scanner(System.in);
//    System.out.print(ArrayChallenge(s.nextLine())); 
//  }
//
//}
  

  public static void main (String[] args) {  
    // keep this function call here  
	  int[] arr = {10,12,4,5,9};
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(arr)); 
  }

}