package oops.singletons;


       /** Steps to implement a singleton pattern **/
      // * private constructor to restrict installation of the class from other classes.
      // * Private static variable of the same class that is the only instance of the class.
      // * public static method that returns the instance of the class, 
      // * this is the global access point for outer world to get the instance of the singleton class.


public class AppConfig {
	
	private AppConfig() {
		
	}
	
	private  static AppConfig obj = new AppConfig (); 
	
	public static AppConfig getIntance() {
		return obj;
	}


}
