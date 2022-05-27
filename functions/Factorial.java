package functions;

import java.util.Scanner;

public class Factorial {
	
	public static void printFactorial (int n) {
		
		if (n <0) {
			System.out.println("Invalid Number");
			return;
		}
		
		int factorial =1 ;
		
		for(int i=n; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of "+ n + " is  " +factorial);
	}
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int n= sc.nextInt();
		
		printFactorial(n);
	}

}
