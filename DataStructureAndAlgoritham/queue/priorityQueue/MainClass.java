package DataStructureAndAlgoritham.queue.priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> no = new PriorityQueue<>();
		
		
		no.add(10);
		no.add(50);
		no.add(100);
		no.add(45);
		
		System.out.println(no);
		
		System.out.println(no.poll());
		System.out.println(no.poll());
		System.out.println(no.poll());
		System.out.println(no.poll());
		
		
		
		
	//	for string
		
//		PriorityQueue<String> ab = new PriorityQueue<String>();
//		
//		ab.add("Mango");
//		ab.add("Apple");
//		ab.add("Orange");
//		ab.add("Banana");
//		
//		System.out.println(ab);
//		
//		System.out.println(ab.remove());
//		System.out.println(ab.remove());
//		System.out.println(ab.remove());
//		System.out.println(ab.poll());
//		
		
		

	}

}
