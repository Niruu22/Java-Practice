package bitManipulation;

//Set the 2nd bit (position=1) of n number n. (n=0101) 

public class SetBits {

	public static void main(String[] args) {
	
		int n = 5; // 0101
		int pos =1; // 0001
		int bitMask = 1 <<pos;
		
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        
      
	}

}

