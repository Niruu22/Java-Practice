package oops.staticKeyword;


             /**  Static Class   **/
        // We can not declared a top level class with static modifier , 
        // but we can declare a nested class as static .
   
        // In Java you can define a class within another class. such a class is calles nested class.
        // Nested class are two types : Static and non Static 

       // Syntax
         /**  
          class  OuterClass{
          ...
             class InnerClass{
              ....
              }
             Static class StaticNestedClass{
             ...
             }
          }
           *
           **/



public class A {
	
	class B{
		
	}
	
	static class C {                 /// StaticNestedClass
		
	}

}
