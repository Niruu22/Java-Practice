package oops.inheritance;


     /** Inheritance   **/

     // Inheritance is an is a relationship.
     //We use inheritance only if an is a relationship is present between the two classes

      // here are some example 
      // * A car is a vehicle 
      // * Orange is a fruit.
      // * A surgeon is a doctor. 
      // * A dog is an animal. 

    
     /** Why java doesn't support multiple Inheritance **/

    // The problem with multiple inheritance is that two classes may define different ways of doing the same thing
    // and the subclass can't choose which one to pick.  
   

public class MainClass {

	public static void main(String[] args) {
		
//	Teacher t = new Teacher ();
//		
//		t.name = "Mr.Niraj Saraf";
////		t.walk();
//	t.eat();
//		t.tech();
//
//		
//		Singer s = new Singer ();
//		
//		s.name = "Zyan";
//		s.sing();
//		s.eat();     // using method overriding
		
		
		Dog d = new Dog ("Tommy");
		
		d.name = "Rocky";   
		d.bark();                  ///  using super keyword in dog (child class)
	}

}
