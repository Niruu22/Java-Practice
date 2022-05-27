package oops.singletons;


    /** Singleton Pattern **/
   // Singleton pattern is mostly used in multi-threaded and database applications.
   // It is used in logging, caching, thread pools,configuration settings etc.

public class MainClass {

	public static void main(String[] args) {
		
		AppConfig obj = AppConfig.getIntance();
		
	}

}
