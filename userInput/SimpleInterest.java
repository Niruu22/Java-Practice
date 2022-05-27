package userInput;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		
//		single output we define 
		
//		int principle = 5000;
//		
//		float rate = 12.2f;
//		
//		int time = 12;
		
		
		
		
		
		// when the user inputs its own value in run time 
		
		Scanner sc = new Scanner(System.in);
		
         int principle = sc.nextInt() ;
		
		float rate = sc.nextFloat();
		
		int time = sc.nextInt();
		
		float simpleinterest = principle * rate * time / 100 ;
	
	
		System.out.println(simpleinterest);
		
		

	}

}
