package nestedForLoopsPaterns;

import java.util.Scanner;

public class Pattern5 {
	
			// print this pattern (not found)
			//         *
			//       * *
			//     * * *
			//   * * * *
			// * * * * *

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		  int n = sc.nextInt();
		  
		 
		  for(int i=1; i<=n; i++) {
			  for(int j=1; j<=n-i; j++) {
				  System.out.print("  ");
			  }
			 for(int j=1; j<=i; j++) {
				 System.out.print("* ");
			 }
			
			  System.out.println();
		  }
	}

}
