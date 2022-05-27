package DataStructureAndAlgoritham.queue.arrayDeque;

public class Mydeque<E> {
	
	Node<E> head, tail;
	
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if (head==null) {
			head= tail =null;
		}
		     head.next = toAdd;
		     toAdd.prev= head;
		     head= toAdd;
	}
	
	public E removeLast() {
		
		if (head== null) {
			return null;
		}
		
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		
		if(tail==null) {
			return null;
		}
		
		return toRemove.data;
	}
	
	
	public static class Node<E>{
		E data;
		Node<E> next , prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;			
		}
	}
	
}

