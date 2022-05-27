package loops;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		// Exercise series sum 2 
		// Compute the natural logarithm of 2, by adding up to n term in the series 
		// 1 -1/2 + 1/3 - 1/4 + 1/5 - ..........1/n
		
		
	Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		float result = 0;
		
		for (float i=1; i<=n; i++) {
			
			if (i % 2 ==0) {
				result -= 1/i;
			}else {
				result += 1/i;
			}	
			
		}
       System.out.println(result);
	}

}
