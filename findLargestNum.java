package JAVA;

import java.util.*;
public class findLargestNum {
	
	 public static int findLargest(int[]nums){
		 int largest = nums[0];
		 for(int num : nums) {
			 if(num > largest ) {
				 largest = num;
			 }
		 }
		return largest;
	}
	 
	 public static int findSecondlargest(int []array) {
		 int largest = Integer.MIN_VALUE;
		 int secondLargest = Integer.MIN_VALUE;
		 
		 for(int i = 0; i<array.length;i++) {
			 int num = array[i];
			 
			 if(largest<num) {
				 secondLargest = largest;
				 largest = num;
			 }
			 else if(num>secondLargest && num!= largest) {
				 secondLargest=num;
			 }
		 }//complex case{10,7,23,45,30};
		 
		 return secondLargest; 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {10,20,5,8,9};
		int [] array = {10,7,23,45,30};
		int secondLargest = findSecondlargest(array);
		System.out.println("The Largest Number is : " + findLargest(nums));
		System.out.println("The secoondLargest Number is : " + secondLargest);
	}
	
}
