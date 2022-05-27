package DataStructureAndAlgoritham.queue.LinkedList;

import DataStructureAndAlgoritham.queue.LinkedList.LinkedList.Node;

public class MyQueue<E> {
	
	private Node<E> head , rear;
	
	public void enqueue (E e) {    /// push() --rear-- > enqueue
		
		Node<E> toAdd = new Node<>(e);
		if (head == null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		
	}
	
	public E dqueue () {      /// pop() --head-- > dequeue
		
		if (head == null) {
			return null;
			
		}
		
		Node <E> temp = head;
		head = head.next;
		
		if (head == null) {
			rear =null;
		}
		
		return temp.data;
		
	}


}
