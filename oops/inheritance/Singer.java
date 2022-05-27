package oops.inheritance;

public class Singer extends Person{
	
	public void sing() {
		
		System.out.println("singer is singing");
	}
	
	 public void eat() {  // (Method Overriding) Same method in parent class 
		 
		 System.out.println("Singer " + name + " is eating");
	 }

}
