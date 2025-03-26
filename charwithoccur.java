package JAVA;

import java.util.Arrays;

public class charwithoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "opentext";
		char charToReplace = 't';
		
		
		//check char presence in String
		
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("Given Character not Available");
			System.exit(0);
		}
		
		// Logic to replace char occurance in String
		
		char[] arr = input.toCharArray(); // opentext
		int cnt = 1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == charToReplace) {
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
