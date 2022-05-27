package functions;

import java.util.Scanner;

public class Question4 {
	
	// Write a function that takes in the radius as input and return the circumference of a circle 
	
	public static double getCircumference (double radius) {
		
		  
		return  2 * 3.14 * radius;
	}

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     
     double r = sc.nextDouble();
     
     System.out.println(getCircumference(r));
     
	}

}
