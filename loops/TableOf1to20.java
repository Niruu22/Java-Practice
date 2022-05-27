package loops;



public class TableOf1to20 {

	public static void main(String[] args) {
		// write a program to print 1 to 20 table at the same time 
		 
				
			for(int j=1; j<=20; j++) {	
				int tableOf = j;
				for(int i=1; i<=10; i++) {
				 
				System.out.print(tableOf * i + " ");
			}
		System.out.println();
		}
	}

}
