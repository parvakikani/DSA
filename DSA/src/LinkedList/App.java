package LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.insert(12);
		linkedList.insert(10);
		linkedList.insert(0);
		linkedList.insert(34);
		
		linkedList.remove(0);
		
		System.out.println(linkedList.size());
		
		linkedList.traverseLinkedList();

	}

}
