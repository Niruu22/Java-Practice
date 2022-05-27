package oops.inheritance;

		/** Super Keyword **/
        // In Java super keyword is used to refer to immediate parent class of a child class.
        // In the other word super keyword is used by a subclass whenever it need to it's immediate super class


public class Animal {

	protected String name ;
	
	public Animal(String name) {                  /// Using super keyword in constructor
		this.name = name;
		System.out.println("Inside animal constructor");
	}
	
	public void run() {
		System.out.println(name + " is Runnig " );
	}
	
	public void dance() {
		System.out.println(name + " is Dancing " );
	}
	
}
