package functions;

import java.util.Scanner;

public class Question5 {
	
	// Write a function that takes in age as input and return if that person is eligible to vote or not.
	// a person of age >18 is eligible to vote 
	
	public static boolean getVote(int age) {
		if (age > 18) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    
    int age = sc.nextInt();
    
    System.out.println(getVote(age));
    
	}

}
