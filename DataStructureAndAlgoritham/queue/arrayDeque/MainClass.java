package DataStructureAndAlgoritham.queue.arrayDeque;

import java.util.ArrayDeque;

public class MainClass{
	

	public static void main(String[] args) {
		
	
		ArrayDeque<Integer> ad = new ArrayDeque <>();
		
		
		ad.push(12);
		ad.push(10);
		ad.push(40);
		
		
		System.out.println(ad.poll());
//		ad.addFirst(25);
//		ad.addFirst(30);
//		
//		
//		ad.pop();
//		
//		System.out.println(ad.peek());
		
	}

}
