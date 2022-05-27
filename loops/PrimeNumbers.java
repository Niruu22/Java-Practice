package loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Prime number Or not
		// write a program that prompts the user to input a positive integer.
		// It should then output a message indicating whether the number is a prime number.
		
	Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for (int i=2 ; i <n; i++) {
			
			if(n % i ==0) {
				isPrime = false;
			}
		}
		
		if (n<2)  isPrime = false; /// if you can't write in a curly braces then write in a single row
			
		System.out.println("is Prime "  + isPrime);
	}

}
