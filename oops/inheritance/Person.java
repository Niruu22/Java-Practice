package oops.inheritance;

         /***  Protected Keyword     ***/

         //you a also assign methods and fields protected. Protected members are accessible.
         // * from within a class 
         // * within its subclass
         // * within the same package




public class Person {
     
	
	 protected String name;
	 
	 public void walk() {
		 System.out.println("Person" + name +" is walking");
	 }
	 
	 public void eat() {                              
		 System.out.println("Person " + name + " is eating");    
	 }
	 
	 public static void laughing() {
		 System.out.println("person is laughing");
	 }
}
