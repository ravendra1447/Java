package JAVA;
import java.util.Scanner;
public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter A Number : ");
//		
//		int number = sc.nextInt();
		int number= 5;
		
		long factorial = 1;
		
		for(int i = 1; i<=number; i++) {
			factorial = factorial * i;
		}
		System.out.print("Factorial of" + number + "is:  " + factorial);
		//sc.close();
		
	}

}
