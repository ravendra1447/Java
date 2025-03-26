package JAVA;

import java.util.Scanner;

public class polindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		 int OriginalNumber = number;
		 int reverseNumber = 0;
		 
		 while(number!=0) {
			 int digit = number%10;
			 reverseNumber = reverseNumber * 10 + digit;
			 number = number /10;
			 
		 }
		 if(OriginalNumber == reverseNumber) {
			 System.out.println( OriginalNumber + " number is a Polindrome ");
		 }else {
			 System.out.println(OriginalNumber + " number is not Polindrome" );
		 }
		 

	}

}
