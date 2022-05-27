   package strings;

public class Anagrams {

	public static void main(String[] args) {

		// most asked question learn most  video no 20 
		//same no of words repeated
		
		
		String a = "cab";
		String b = "abc";

		boolean isAnagram = true;
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
				for (char c: a.toCharArray()) {
					int index = (int) c;
					al[index]++;
			  	}	
				for (char c: b.toCharArray()) {
					int index = (int) c;
					bl[index]++;
				}
			
				for(int i=0; i<256; i++) {
				if(al[i] != bl[i]) {
					isAnagram = false;
					break;
				}
	    	}
			if(isAnagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Angram");
		}
	}

}

