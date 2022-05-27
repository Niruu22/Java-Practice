package bitManipulation;

// clear the 3rd bit (position=2) of n number n. (n=0101)

public class ClearBit {

	public static void main(String[] args) {
		int n =5;
		int pos =2;
		int bitMask= 1<<pos;
		int notBitmask = ~(bitMask);
		
		int newNumber = notBitmask & n;
		System.out.println(newNumber);

	}

}
