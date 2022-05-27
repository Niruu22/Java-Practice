package conditionalStatements;

public class NestedIFElse {

	public static void main(String[] args) {
		
		// check the maximum number
		
		int a = 2, b=15, c =10;
		int result = 0;
		
		if (a>b) {
			if(a>c) {
				result= a;
				
			}else {
				result = c;
			}
			
		}else {
			if (b>c) {
				result =b ;
			}else {
				result = c;
			}
		}	
		 
		 System.out.println("The larger of these three number is "  + result);
		}	
		}

	


