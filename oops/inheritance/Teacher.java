package oops.inheritance;



		
		/**  Method Overriding   **/
		
		// What happens if the same method is defined in both the superclass and subclass ?
		// Well, in that case , the method in the subclass overrides the method in the superclass 


public class Teacher extends Person {
   
	public void tech() {
		
		System.out.println(name + " is teaching ");
	}
	
	 public void eat() {                         // (Method Overriding ) same method in parent(person) class 
		 super.eat();
		 System.out.println("Teacher " + name + " is eating");
	 }
}
