package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Q. Palindrome Number
		// Write a program to check is given number is a palindrome or not 
		// (" An integer is a if the reverse of that number us equal to the original number.")
		// e.g 12321 , 121, 1 , 4554 etc
		// formula (number * 10 + lastdigit )
		
		Scanner sc = new Scanner (System.in);
		
          int n = sc.nextInt();
          
          int temp = n;
          
          int reversedNumber = 0;
          
          while(temp > 0) {
        	  
        	  int lastDigit = temp %10;
        	  
        	  temp /=10;
        	  
        	  reversedNumber = reversedNumber * 10 + lastDigit ;
        	  
       	 // System.out.println(lastDigit + " " + temp + " " + reversedNumber);
          }
          
          if (reversedNumber == n) {
        	  System.out.println(n + " is Palindrome ");
          }else {
        	  System.out.println(n + " is not Palindrome ");
          }
	}

}
