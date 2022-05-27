package oops.staticKeyword;

import oops.staticKeyword.A.B;
import oops.staticKeyword.A.C;

/**    Static Keyword **/
	// The keyword static indicates that the particular member belongs to a type itself,
	// rather than to an instance of that type. It id mainly used to used to help memory management
	
	// The keyword can be applied to variables,methods,block and nested. 

    /// it only belongs to a class ........ not a object


public class StaticKeyword {
	
	
	static {                   /// Static block (exicutes first any condition ) when you want some thing intilized first or a excute then the static block is used.
		
		System.out.println("in block 1");
	}

	static {
		System.out.println("in block 2");
	}
	
	
	
	public static void main(String[] args) {
		
		
//		Person p = new Person(); 
//		
//		p.age = 10 ;
//		
//		p.name = "Niraj";
//		
//		System.out.println(p.breed +" "+ p.age +" "+ p.name);
		
		
//		   A objA = new A();
//		
//           B objB = objA.new B();         /// Import B (A.B) for direct access B
//           
//           C objC = new A.C();                /// A direct access through outerClass 
//           
           
           System.out.println("inside main method");
           
        }
	
	  static {
     		System.out.println("in block 3");
     	}

}
