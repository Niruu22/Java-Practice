package DataStructureAndAlgoritham.List.arrayList;

import java.util.LinkedList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		
		
		List<String > fruits = new LinkedList<>();
//		List<String > vegetable = new ArrayList<>();
//
//	
//		fruits.add("Apple");
//    	fruits.add("Orange");
//    	fruits.add("banana");
//    	
//    	vegetable.add("potato");
//    	vegetable.add("tomato");
//    	vegetable.add("carrot");
//    	
//    	fruits.addAll(vegetable);    	
//		
		System.out.println(fruits);
		
		
		
		// methods in 
		// toArray()
		
		String X[] = new String [fruits.size()];
		fruits.toArray(X);
		
		for(String e: X) {
			System.out.println(e);
		}
				
		
		
		
		
//		Double x = 25.4;
//		
//		Pair<String , Integer> p1 = new Pair("Niraj" , 6165);   ///generic class object
//		Pair<Boolean , String> p2 = new Pair(true, "Hello");
//		
//		p1.getDiscription();
//		p2.getDiscription();
	




	}

}
