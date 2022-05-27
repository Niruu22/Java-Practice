package conditionalStatements;

public class ElseIfClass {

	public static void main(String[] args) {
		
		int number = 23;
		
		if (number <= 10) {
			System.out.println("Number is less than 10");
		}else if (number > 10 && number <=20) {
			System.out.println("Number in between 10 and 20");
		}else if (number > 20 && number < 30) {
			System.out.println("Number in between 20 and 30");
		}else {
			System.out.println("the number is greater than 30");
		}
		
	}

}
