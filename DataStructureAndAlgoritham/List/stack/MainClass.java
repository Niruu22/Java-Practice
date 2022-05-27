package DataStructureAndAlgoritham.List.stack;

import java.util.Stack;


 /// push () insert (add)  ..... push
//  pop()  delete (remove)..........return
//  peek() current head or after removing the element which is head its show........return
// empty()

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack <Integer> stack = new MyStack<>();
		
		
		stack.push(25);
		stack.push(55);
		stack.push(15);
		stack.push(20);
		
		
		int popped = stack.pop();
	       
		System.out.println(popped);
		
	    int peeked = stack.peek();
		
		System.out.println(peeked);
	}

}
