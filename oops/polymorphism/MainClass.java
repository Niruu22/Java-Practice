package oops.polymorphism;

        /** PolyMorphism - (more than one) **/
    // PolyMorphism  allow as to perform a single actions in different ways. 
    // polyMorphism allows you to define one interface and have multiple implementations  
   


        /** Types of PolyMorphism **/

       /** 1. Run Time PolyMorphism */
       // It is also know as Dynamic binding, Late binding and overriding as well.
       // (Overriding is run time polyMorphism having same method with same parameters or signature, but associated in class & its subclass)
       // (Slower executions)

       /** 2. Compile - time PolyMorphism  */
       // It is also know as Static binding, Early Binding and overloading as well.
       // (Overriding is compile time polyMorphism where more than one methods share the same name with different parameters or signature and different return type)
       //(Faster execution).


public class MainClass {

	public static void main(String[] args) {
		
		/** Run time polyMorphism */
		Dog d = new Dog ();
//		
//		
		Pet p =d;        /// up casting 
//		Animal a =d;
//		
//		d.walk();
//		p.walk();
		
		System.out.println(d.name);
		System.out.println(p.name);                 /// IMP (variables can not override) only (Method can Override)
		
		
		/** Compile time polyMorphism */
		
//		greetings();
//		greetings("Good Mornig");
//		greetings("Good Evening" , 5);
		
	}
	
		public  static void greetings() {
			System.out.println("HI , Niraj");
		}
		
		public static void greetings(String s) {
			System.out.println(s);
		}
		
		public static void greetings(String s , int count) {
			for(int i=0; i<count; i++) {
				System.out.println(s);
			}
			
			
		}
			
       

}
