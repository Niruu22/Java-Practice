package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//  Write a program to print fibonacci series of n th term where n is given by user
		
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int a =0;
		int b =1;
		
		System.out.print(a+" ");   /// print on same line using (print)  
		System.out.print(b+" ");
		
		for (int i =1; i<n-2; i++) {
			int c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
