package strings;

import java.util.Scanner;

public class Question3 {
	
	// Input an email from the user. you have to create a username from email by deleting the part 
	// that comes after '@'Display that username to user.
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
        
		String email = sc.next();
		String userName = "";
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '@') {
				break;
			}else {
				userName += email.charAt(i);
			}
		}
		System.out.println(userName);
	}

}
