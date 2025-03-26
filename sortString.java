package JAVA;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "rock";
		char arr[] = str.toCharArray();
		
		char temp;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		
		//Aproach -2
		String str1 = "rock";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		System.out.println(new String(charArray));
		
		
		
		//remove special character
		String input = "$java$@st@ar";
		String plain = input.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(plain);
		

	}

}
