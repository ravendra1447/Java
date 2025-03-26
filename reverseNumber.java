package JAVA;

import java.util.Scanner;
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number");
		int number = sc.nextInt();
		int OriginalNumber = number;
		int reverseNumber = 0;
		
		while (number !=0) {
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
			
		}
		System.out.print("Reverse number is " + reverseNumber);
		sc.close();
	}

}
