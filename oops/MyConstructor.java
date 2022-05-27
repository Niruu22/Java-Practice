package oops;


class Vehicle{
	
	int wheels;
	int headlights;
	 
//	Vehicle(){     /// defalut constructor 
	
	
	Vehicle(int noOfWheels){       /// Parameterized constructor  
	wheels = noOfWheels;   
	headlights = 2;
		
	}
	
}

public class MyConstructor {
	
	
//	  MyConstructor(){
//		  
//		  System.out.println("The object is created");
//	  }

	public static void main(String[] args) {

           Vehicle cars = new Vehicle (4);
           Vehicle scooty = new Vehicle (2);
        
           
           System.out.println("The Wheels of the car is "+ cars.wheels  + " and headlights " + cars.headlights);
          
		   System.out.println("The Wheels of the scooty is "+ scooty.wheels + " headlights " + scooty.headlights );

	}

}
