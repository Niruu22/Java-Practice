package arrays;
import java.util.*;

public class Question1 {

	  // Take a matrix as input for user search for a given number x and print the indices at which it occurs.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dimensions");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int numbers [][] = new int [rows][cols];
		
		// input
		System.out.println("Enter rows and cols");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter x");
		int x = sc.nextInt();
		
		// output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(numbers[i][j] == x)
				System.out.println("x found at location : (" + i + ", " + j +")");
			}
		}
		
	}

}
