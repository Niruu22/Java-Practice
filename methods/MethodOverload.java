package methods;


public class MethodOverload {
	
	  static int sum (int a, int b) {
		 return  a + b;
		
	  }
	  
	  static void sum () {
		  System.out.println("The sum of two integer is");
	  }
	  
	  static int minus (int c , int d) {
		  return c-d;
	  }
	  
	  static void minus() {
		  System.out.println("The Substraction of two integer is");
	  }

	public static void main(String[] args) {
		
		int f1 = 10;
		int f2 =20;
		
		int c1 =20;
		int c2 = 10;
		
		int result = sum(f1,f2);
		int results = minus(c1,c2);
		
		sum();
		System.out.println(result);
		minus();
		System.out.println(results);
		
		
		

	}

}
