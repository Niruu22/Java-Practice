package methods;



class Vehicle {
	
	int wheels;
	int headlights;
	String colour;
	
	Vehicle(int wheels){
		this.wheels = wheels ;
		headlights = 2;
	}
	
	Vehicle(int wheels , String colour){
		this.wheels = wheels;
		this.colour = colour;
		headlights =2 ;
	}
}
public class ConstrctorOverloading {

	public static void main(String[] args) {
		
		 Vehicle cars = new Vehicle (4);
         Vehicle scooty = new Vehicle (2);
      
		
		Vehicle eRickshaw = new Vehicle(3,"Yellow");
		
		 System.out.println("The Wheels of the car is "+ cars.wheels  + " and headlights " + cars.headlights);
         System.out.println();
		   System.out.println("The Wheels of the scooty is "+ scooty.wheels + " headlights " + scooty.headlights );

		 System.out.println();
		System.out.println(eRickshaw.wheels + " wheels and colour is " + eRickshaw.colour);

	}

}
