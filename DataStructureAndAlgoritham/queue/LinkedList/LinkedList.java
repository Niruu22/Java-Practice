package DataStructureAndAlgoritham.queue.LinkedList;



public class LinkedList<E> {

	
	       Node head;
		
		public void add (E e) {
			Node toAdd = new Node ((int) e);
			
			 if (isEmpty()) {
				   head = toAdd;
				   return;
			   }
			   
			   Node temp = head ;
			   while(temp.next != null) {
				   temp = temp.next;
			   }
			   temp.next = toAdd;
		   }
		
		   void print() {
			   Node temp = head ;
			   while(temp != null) {
				   System.out.print(temp.data + " ");
				   temp = temp.next;
			   }
		   }
		  
		   
		 public  boolean isEmpty() {
			   return head == null;
		   }   
		 
		 
		 public E removeLast()   throws Exception {
			 Node<E> temp =head;
			 
			 if(temp == null) {
				 throw new Exception ("Cannot remove last element in the linkedlist");
			 }
			 
			 if(temp.next == null) {
				 Node <E> toRemove = head;
				 head =null;
				 return toRemove.data;
			 }
			 
			 while(temp.next.next != null) {
				 temp = temp.next;
			 }
			 Node <E> toRemove = temp.next;
			 temp.next = null;
			 return toRemove.data;
		 }
		 
		 public E getLast() throws Exception {
	          Node<E> temp =head;
			 
			 if(temp == null) {
				 throw new Exception ("Cannot peek last element in the linkedlist");
			 }
			 
			 while(temp.next != null) {
				 temp = temp.next;
			 }
			 Node <E> toRemove = temp.next;
			 temp.next = null;
			 return temp.data;
			 
		 }
		 
		 
		 static class Node<E> {
				E data;
				Node <E>next;
				
				public Node(E data) {
					this.data = data;
					next = null;
				}
			}

	
}
