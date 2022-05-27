package methods;

public class PassByValue {
	
	
	/// primitive data types 
	
	static void swap(int a , int b) {
		int temp =a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {

        int c = 34;
        int d = 12;
        
        swap(c,d);
        System.out.println(c + " " + d);
	}
	
	

}
