package JAVA;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		//System.out.print(areAnagram(str1, str2));
		
		if(areAnagram(str1, str2)) {
			System.out.print("String is Angram");
		}else {
			System.out.print("String is not Anagram");
		}
		

	}
	public static boolean areAnagram(String str1, String str2) {
		 char [] ch1 = str1.toCharArray();
		 char [] ch2 = str2.toCharArray();
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 
		 //Compare sorted Arrays 
		 return Arrays.equals(ch1, ch2);
	}

}
