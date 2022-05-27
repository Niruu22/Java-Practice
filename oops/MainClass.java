package oops;

// classes and objects 

class Cat {
	
	boolean hasFur;                               /// states 
	String colour,bread;
	int legs,eyes;
	
	public void walk() {                             //// beheviour of class 
		System.out.println("cat is walking");
	}
	
	public void eat() {
		System.out.println("cat is eating");
	}
	
	public void discription() {
		System.out.println("My cat has " + legs + " legs" + " and " + eyes+ " eyes");
	}
}

class Dog{
	
	String bread, name;
	
	public void jump () {
		System.out.println("My dog  " + name + " jump");
	}
	
	public void discription() {
		System.out.println("My Dog name is " + name + " and it's bread is " + bread);
	}	
}

public class MainClass {

	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1; 
//		
//	    cat1.discription();
//	    cat2.discription();
		
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.bread = "Labrador";
		dog1.name = "Rocky";
		
		dog2.bread = "Husky";
		dog2.name = "Tommy";
		
		dog1.jump();
		dog1.discription();
		
		System.out.println();
		
		dog2.jump();
		dog2.discription();

	}

}
