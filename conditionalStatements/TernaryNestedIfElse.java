package conditionalStatements;

public class TernaryNestedIfElse {

	public static void main(String[] args) {
		
		int a =12 , b=10, c=20;
		
		int result = 0;
		
		result = a>b ? a>c ? a:c : b>c ? b:c;
		
		System.out.println("The Largest number is "  + result);

	}

}
