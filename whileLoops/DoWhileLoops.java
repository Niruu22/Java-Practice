package whileLoops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {

           Scanner sc = new Scanner ( System.in);

           int n = 1;
           
           do {
        	  
        	   n = sc.nextInt();
        	   
        	   System.out.println("Number " + n);
        	   
           }while(n != 0);
        	      
           
	}

}
