package functions;

import java.util.Scanner;

// Make a function to multiply 2 numbers and return the product    

public class Multiply {
   
	public static int calculateMul (int a, int b) {
		int mul = a*b;
	    return mul;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int mul = calculateMul(a, b);
		
		System.out.println("The multiplication of two nos is :" + mul);
        
	}

}
