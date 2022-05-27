package oops.abstraction;

     /** Abstract class  */
    // * A class that is declared using "abstraction" keywords is known as abstract class.
    // * It can  have abstract methods (methods without body) as well as concrete methods (regular method with body).
    // * A normal class (Non-abstract class) cannot have abstract class.
    // * An abstract class can not be instantiated which means you are not allowed to create an object of it.
    // * An abstract class must be extended and in a same way abstract method must be overridden

public abstract class Car {
	
	// we do not create a object of abstract  class 
	
	public abstract void accelerate(); ///  
	
	public abstract void breaking ();  ///
	
	public void honk() {
		System.out.println("car is honking");  /// concrete method (regular method with body)
	}

}
