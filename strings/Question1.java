package strings;
import java.util.*;

public class Question1 {
	
	// Take an array of string input from the user & find the cumulative (combined) length of all those things

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); 
		
		String array [] = new String [size];
		
		int tolength = 0;
		
		for(int i=0; i<size; i++) {
			array [i] = sc.next();
			tolength += array[i].length();
		}
		
        System.out.println(tolength);
	}

}
