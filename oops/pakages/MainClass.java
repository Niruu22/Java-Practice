package oops.pakages;

import java.util.Scanner;

import oops.pakages.models.*;


public class MainClass {
	
	// Learn pakages and Access modifier (Private , public , default, protected )

	public static void main(String[] args) {


		Student obj = new Student ("Tom");
		
		Teacher teacher = new Teacher();
		
          obj.getPassword();      
		
		Scanner sc = new Scanner (System.in);

		System.out.println(obj);    
	}

}
