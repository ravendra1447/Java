package JAVA;

import java.util.*;
public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,2,3,4,5,6,3,2,1};
		HashSet<Integer> NonDuplicate = new HashSet<>();
		HashSet<Integer> Duplicate = new HashSet<>();
		
		for(int num : nums) {
			if (!NonDuplicate.add(num)) {
				Duplicate.add(num);
			}
		}
		
		System.out.println("The Non Duplicate Number is : " + Duplicate);
		

	}

}
