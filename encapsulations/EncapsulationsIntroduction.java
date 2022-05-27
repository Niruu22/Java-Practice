package encapsulations;


        // Encapsulation in java is process of wrapping code and data together into a single unit 

        // java packages 
        // Access Modifier 


        /// Why Encapsulation 

        // 1. In java , encapsulation helps us to keep related field and methods together,
        //which makes our code cleaner and easy to read.
        
        // 2. It helps to control the modification of our data fields.

        // 3. It helps to decouple components of a system. These decouple components can be developed,
        // tested and debugged independently and currently. And, any changes in a particular components 
        // do not have any effect on other components.


        // How to achieve encapsulation 
        // 1. Declare the variables of class as private.
        // 2. Provide public setter and getter method that will be used write and read these variable values.
        // 3. That it
          







public class EncapsulationsIntroduction {

	public static void main(String[] args) {
		
		Students obj = new Students ();
		
		obj.setAge(22);
		obj.setName("niraj");
        
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
