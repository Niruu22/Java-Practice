package functions;

import java.util.Scanner;

public class Question3 {
	
	 // Write a functions which takes in 2 numbers and return the greater of those two 
	
	public 	static int greaterNum(int a , int b) {
          if (a >b) {
        	  return a;
          }else {
        	  return b;
          }
	
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println(  "The greater number is "     + greaterNum(a, b));
			
		

	}
 
}
