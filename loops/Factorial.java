 package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		// Write a program to find a factorial value of a number through the keyboard
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int factorial = 1;
		
		for (int i =n; i>=1; i--) {
			factorial = factorial * i;
		}
          System.out.println(factorial);
	}

}
