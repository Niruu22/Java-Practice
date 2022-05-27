package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i =0; i < 100; i++) {
//			if(i==35) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
		
		// for counting upto negative number
       Scanner sc = new Scanner (System.in);
		
		for(;;) {
			int n = sc.nextInt();
			if(n < 0) {
				break;
			}
		
		}
		
		
		
		
		
	}

}
