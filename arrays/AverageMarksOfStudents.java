package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
		
		// Calculate the average of students  
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of student");
           int n = sc.nextInt();
           
           int marks [] =new int [n];
           
        System.out.println("Enter the marks now"); 
           
           for(int i =0; i<n; i++) {
        	   marks[i] = sc.nextInt();   // set the next marks array 
           }
           
           int averageMarks =0;
           
           for(int i =0 ; i<n; i++) {
        	   averageMarks += marks[i];
           }
           averageMarks /= n;
           
           System.out.println("The average Marks is " + averageMarks);
			
           
	}
	

}
