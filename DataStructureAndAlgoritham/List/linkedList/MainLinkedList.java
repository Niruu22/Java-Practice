package DataStructureAndAlgoritham.List.linkedList;



public class MainLinkedList {

	public static void main(String[] args) {
		
		
		MyLinkedList myLL = new MyLinkedList();
	
		for (int i=0; i<10; i++) {
			myLL.add(i);
		}
	
		myLL.print();
		
	}
}


