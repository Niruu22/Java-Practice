package oops.finalKeyword;


             /** Final Keyword */ 

         // You can assign final keyword to variable, methods, class.
         // 1. A final variable cannot be changed.
         // 2. A final method cannot overridden.
         // 3. A final class cannot be extended.


            // Final Variable
      // A final variable can be initialized once.

// We must initialized a final variable, otherwise compiler will throw compile time error.
// It is a good practice to name final variable in all CAPS.
// A final variable is called blank final variable, if it not initialized while declaration.
// In case of reference final variable, internal state of the object pointed by that reference can be changed

     
         // Final Method 
   // In the final the method can't override 

       // Final Class 
   // In the class when we use final keyword then we can't inherit(extends) the class

public class MainClass {
	

	public static void main(String[] args) {
	
	
		final Student obj = new Student();
		
		
		System.out.println(obj.NAME);
		
		     

	}

}
