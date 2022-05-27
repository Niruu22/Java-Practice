package oops.pakages.models;

public class Student {

	private String name;           /// private modifier 
	
	public Student (String name) {
		this.name = name;
	}
	
	public String getName() {   /// public modifier
		return name;
	}
	
	public String getPassword() {      /// default modifier   remove public for defalut
		return "hkjZXHhkl";
	}
	
}
