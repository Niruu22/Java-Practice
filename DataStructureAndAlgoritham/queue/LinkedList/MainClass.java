package DataStructureAndAlgoritham.queue.LinkedList;



public class MainClass {

	public static void main(String[] args) {

     
		
	       MyQueue <Integer> mq = new MyQueue<>();
			
			
			mq.enqueue(54);
			mq.enqueue(25);
			mq.enqueue(40);
			mq.enqueue(20);
			
			System.out.println(mq.dqueue());
			System.out.println(mq.dqueue());
			System.out.println(mq.dqueue());
			System.out.println(mq.dqueue());
			System.out.println(mq.dqueue());
			
			mq.enqueue(85);
			System.out.println(mq.dqueue());
			
//			q.add(12);
//			q.add(46);
//			q.add(30);
//			
//			System.out.println(q);
//			
//			System.out.println(q.remove());
//			System.out.println(q.remove());
//			System.out.println(q.remove());
//			System.out.println(q.remove()); /// Exception throws 
	//

			
	       // if you just return poll in empty queue the output is in NULL
	     //  System.out.println(q.poll());  //   return a null 


	 
	 
	 
		
	}

}
