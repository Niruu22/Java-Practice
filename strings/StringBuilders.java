package strings;

public class StringBuilders {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tony");
          
		
		//set the character
//		sb.setCharAt(0, 'T');
//		System.out.println(sb);
		
		
		// insert the character
		
		sb.insert(2,'n');
		System.out.println(sb);
		
       // delete the character 
		
		sb.delete(2,3);
		System.out.println(sb);
	}

}
