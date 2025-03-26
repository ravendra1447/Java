package JAVA;

import java.util.Scanner;

public class add {

	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr the First Number");
		int a =sc.nextInt();
		
		System.out.println("Enter the SEcond Number");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("The Final Output is :"+c);
		
		sc.close();

	}

}
