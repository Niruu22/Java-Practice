package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// find X raised to power Y 
		// Two numbers are entered through the keyboard.
		//Write a program to find the value of one number raised to the power of another number 
		// (Do Not use java built in method)

		
	Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int  result = 1;
		
		for(int i =0; i <b; i++) {
			
			result *=a;
		}
		 System.out.println(result);
	}

}
