package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		//Sum of the digit of the number.
		// Write a program to find the sum of the digits of a number.
		// e.g for given number 523, the sum is 10
		
		
		
		Scanner sc = new Scanner(System.in);
		
         int n =sc.nextInt();
         
         int temp = n;
         
         int sum =0;
         
         while(temp>0) {
        	 
        	 int lastDigit = temp % 10;
        	  temp /= 10;
        	  
        	  sum += lastDigit;
        	  
       	  System.out.println(lastDigit + " " + temp + " " + sum); /// if you want to check how our condition work
        	 
         }
         
         System.out.println("The sum of the digits of " + n + " is " + sum);
	}

}
