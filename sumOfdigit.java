package JAVA;
import java.util.Scanner;
public class sumOfdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		while (number !=0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
			
		}
		System.out.print("The Sum Of The number is : " + sum);
		sc.close();
	}

}
