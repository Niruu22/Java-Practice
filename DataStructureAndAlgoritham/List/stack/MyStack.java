package DataStructureAndAlgoritham.List.stack;



public class MyStack<E> {
	
	private LinkedList<E> ll = new LinkedList<>();

	void push (E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
		throw new  Exception(" Pooping from empty stack is not allowed");
		}
		
	   return ll.removeLast();
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new  Exception(" Peeking from empty stack is not allowed");
			}
		return ll.getLast();
	}
}
