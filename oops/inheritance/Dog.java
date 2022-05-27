package oops.inheritance;

public class Dog extends Animal {

	public Dog(String name) {                 
		super(name);                   /// using super keyword in constructor
		System.out.println("inside dog constructor");
	}

	public void bark() {
	//	super.dance();             /// super keyword (if you access parent class from childern class) 
		System.out.println(name + " is barking ");
	}
}
