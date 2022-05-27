package methods;

public class Introduction {
	
	
	
	static int maxOf(int a , int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi ");
		System.out.println("Niraj Good Morning ");
	}

	public static void main(String[] args) {
		
		 int firstNumber = 200;
	     int secondNumber = 120;
         
     int  result =  maxOf(firstNumber,secondNumber);
     
         
         System.out.println(result);
         
         sayHi();
		
	}

}
