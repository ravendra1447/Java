package JAVA;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter A number");	
		int number = sc.nextInt();
		int OriginalNumber = number;
		double sum = 0;
		int numberOfdigit = String.valueOf(number).length();
		
		while(number !=0) {
			int digit = number %10;
			sum = sum + Math.pow(digit, numberOfdigit);
			number = number /10;
		}if(sum == OriginalNumber) {
			System.out.print(OriginalNumber + " Number is a Armstrong");
		}else {
			System.out.print(OriginalNumber + "Number is Not a Armstrong");
		}
		sc.close();
		
	}

}
