package binarySearch;

import java.util.Arrays;

public class ThreesumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,2,1,-4};
		int target = 1;
		threeSumClosest(nums, target);
	}
	  public static int threeSumClosest(int[] nums, int target) {
	      int mindif = Integer.MAX_VALUE;
	      int closesum = Integer.MAX_VALUE;
	       for(int i=0;i<nums.length-2;i++){
	          Arrays.sort(nums);
	          int left = i+1;
	          int right = nums.length-1;

	          while(left<right){
	              int sum = nums[i]+nums[left]+nums[right];
	              int diff = sum-target;
	              if(diff<mindif){
	                  mindif = diff;
	                  closesum = sum;
	              }

	              if(sum<target){
	                  right++;
	              }else if(sum>target){
	                  left--;
	              }else{
	                  return sum;
	              }
	          }
	          
	       } return closesum;
	    }

}
