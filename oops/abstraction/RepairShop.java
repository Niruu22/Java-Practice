package oops.abstraction;


         /** Abstraction  */
         // * Data abstraction is the process of hiding certain details and showing only essential information to the user.
         // * It helps to reduce programming complexity and efforts 
         // * Abstraction can be achieved with either abstraction classes or interfaces 
      

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("Car is Repair");
	}
	
	public static void main(String[] args) {
		
		WagonR WagonR = new WagonR ();
		Audi Audi = new Audi();
		
		repairCar(WagonR);   /// wagonR is a car 
		repairCar(Audi);     /// Audi is a car

	}

}



        /**  difference between Encapsulation and Abstraction */

   // Encapsulation :-  In the Encapsulation for the security reason data hiding is provided (access denied)
                           //  ki si class ki anthorised access toh nahi milrah ki si variable ko

                        // * Encapsulation means hiding the internal details or mechanics of how an object does something for security reasons.
 
                        // * Encapsulation means binding the code and data into a single unit
 
                        // * Encapsulation solved it at implementation level

  // Abstractions :-  In the abstraction give the access denied for reducing complexity (for hidding)
                        
						                    
						// * Abstraction is about hiding unwanted details while showing most essential information.
						
						// * Abstraction allows focussing on what the information object must contain
						
						// * Abstraction solves the issues at the design level.

