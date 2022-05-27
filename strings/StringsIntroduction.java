 package strings;

public class StringsIntroduction {

	public static void main(String[] args) {
		
		/// strings are immutable (not change )
		
		
//		String name = "Niraj";
//		 
//		System.out.println(name);
		
		
	          //	Functions in Strings 
		
		// 1. char charAt(int index) take int value then show its character
		
//		String name = "Niraj";
//		
//		System.out.println(name.charAt(2));
		
		
		
		
		// 2. int length()  
		
//		String name = "Niraj";		
		
//		System.out.println(name.length());
		
		
		
		
		// 3. String substring(int beginIndex)
		
		String name = "Niraj Kishor Saraf";
		
		System.out.println(name.substring(6));
		
		
		// String sentence = "TonyStark";
		// String name = sentence.substring(4);
		
		// 4. String substring (int beginIndex , int endIndex )
		
//		String name = "Niraj Saraf";
//		
//		System.out.println(name.substring(6, 11));
		
		
		
		
		// 5. boolean contains (CharSequence s) character is in or not
		
//		String name = "Niraj Saraf";
//		
//		System.out.println(name.contains("kishor"));
		
		
		
		
		
		// 6 Boolean equals (Object another) check both the strings are equals or not
		
//		String name = "Niraj";
//		String name2 = new String("Niraj");
//		
//		System.out.println(name.equals(name2));		
		
		
		
		
		// 7. Boolean isEmpty() check the string is empty or not
		
//		String name = "Niraj";
//		
//		System.out.println(name.isEmpty());
		
		
		
		
		// 8. String concat (String str) add the two strings Or Using ('+')
		
//		String f1 = "I am youngest Billioniare";
//		String f2 = " in my family";
//		
//		System.out.println(f1.concat(f2));
		
		
//		Using ('+')
		
//		String firstName = "Niraj";
//		String secondName = " Saraf";
//		
//		String result = firstName + secondName;
//		System.out.println(result);
		
		
		
		
		
		// 9. String replace ( char old, char new ) replace the string value
		
//		String f1 = "Niraj";
//		
//		System.out.println(f1.replace('N', 'S'));
		
		
		
		
		
		// 10. String [] split (String regex)
		
		
//		String cars = "Audi,Ferrari,Lamborgini,Ford,Lexus,RR,Mercides";
//		String allCars[] = cars.split(",");
//		
//		for (String noOfCar : allCars) {
//			System.out.println(noOfCar);
//		}
		
		
		
		
		
		// 11. int indexOf (int ch ) take char type its shows its potions 
		
//		String f1 = "Niraj";
//		
//		System.out.println(f1.indexOf('N'));
		
		
		
		
		
		// 12. String toLowerCase()  return in small letters 
		
		
//		String f1 = "Niraj Saraf";
//		
//		System.out.println(f1.toLowerCase());
		
		
		
		
		// 13. String toUpperCase() return in Capital letter 
		
//		String f1 = "Niraj Saraf";
//		
//		System.out.println(f1.toUpperCase());
		
		
		
		// 14. String trim() remove unwanted spaces 
//		
//		String f1 = "     Niraj         ";
//		
//		System.out.println(f1.trim());

	}

}
