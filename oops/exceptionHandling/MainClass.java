package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		
		try {
		int a =5;
		int b =0;
		int c = a/b;
		
		
		System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " please check the code");
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		System.out.println("continue the code ");
		System.out.println("need to code");

	}

}
