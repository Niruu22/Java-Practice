package bitManipulation;
 
      // Get the 3rd bit (position=2) of n number n. (n=0101) 
    
public class GetBits {

	public static void main(String[] args) {
		int n =5; // 0101
		int pos =3;
		int bitMask = 1<<pos;
		
		if((bitMask & n) == 0) {
			System.out.println("Bits are zero");
		}else {
			System.out.println("Bits are one");
		}
		
	}

}
