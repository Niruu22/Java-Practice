package oops.interfaces;

             /** Java Interface  */

     // An interface defines a set of specification that other classes must be implements.

     // Why use Interfaces
    // Interface provide specifications that a class(which implements it) must follow.
    // Similar to abstract classes, interface help us to achieve abstraction in java.
    // In java multiple inheritance is not possible by extending classes.
    // However, a class can implement multiple interfaces. This allows us to get the Functionality of multiple inheritance in java.
    // For example 
    /**
       interface Line{
        ...
      }
       interface Polygon{
        ...
      }
        class Rectangle implements Line,Polygon{
        ...
      }
     
     */



public class Person implements Student,YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVido();
		
		YouTuber obj2 =obj;
		

	}

	@Override
	public void study() {
		System.out.println("Person is studing");
		
	}

	@Override
	public void makeVido() {
		System.out.println("person is making a videos");
		
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		
	}

	
	

}

     /** Few important points about Interfaces */
    // 1. We can't instantiate an interface in java.

    // 2. Interfaces can't have constructor because we can't instantiate them and interfaces can't have a method with body.

    // 3. By default any attribute of interface is public, static and final, so we don't need to provide access modifier to the attributes
    // but if we do, compiler doesn't complain about it either.

    // 4. By default interface methods are implicitly abstract and public, it makes total sense because the method don't have body 
    //    and so that subclasses can provide the method implementation.

    // 5. An Interface can't extend any class but it can extends another interface.
  
    // 6. A class implementing an interface must provide implementation for all of its method unless it's an abstract class.




