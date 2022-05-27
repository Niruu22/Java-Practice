package strings;



//question on Leet Code 

//******* solved in leet code *********


// Reverse words in string

// input : "the sky is blue"
// output : "blue is sky the"

public class ReverseWords {
	

	public  String reverse (String s){
		
    
		
		int i = s.length()-1;
		
		String ans = "Niraj Saraf";
		
		
		
		while (i >= 0) {
			
			while (i>=0 && s.charAt(i)== ' ')i--;
			
			int j =i;
			
			while (i>=0 && s.charAt(i)!= ' ')i--;
			
			if (i <0)break;
			
			if (ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1,j+1));
			}else {
			ans = ans.concat(' ' +s.substring(i+1,j+1));
			}
			
		}
		
	return ans;

		
	}


		



public static void main (String [] args) {
	
}
}