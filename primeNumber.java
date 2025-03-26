package JAVA;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter A Number : ");
		
		int number = sc.nextInt();
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
		}else {
			for(int i =2; i<=Math.sqrt(number); i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
					
				}
			}
		}if(isPrime) {
			System.out.println(number  + "  Number is a Prime");
		}else {
			System.out.println(number + " Numner is a Not a Prime");
		}
		sc.close();
	}

}
