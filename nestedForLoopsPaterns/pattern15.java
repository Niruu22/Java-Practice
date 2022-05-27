package nestedForLoopsPaterns;

public class pattern15 {

	public static void main(String[] args) {
		// number pyramid
		
		
		int n =5;
		
		for(int i=1; i<=n; i++) {
			//spaces 
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//numbers 
			for(int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
