package LinkedList;

public class LinkedList <T extends Comparable<T>> {
	private Node<T> root;
	private int count;
	
	public void insert (T data){
		this.count++;
		if (this.root == null){
			this.root = new Node<T> (data);
		}else{
			this.root.insert(data);
		}
	}
	
	public void remove (T dataToRemove){
		this.count--;
		if (this.root != null){
			if (this.root.getData().equals(dataToRemove)){
				this.root = this.root.getNextNode();
			}else{
				this.root.remove(dataToRemove, root);
			}
		}
	}
	
	public void traverseLinkedList(){
		Node<T> actualNode = this.root;
		
		while(actualNode != null){
			System.out.print(actualNode.getData()+"-");
			actualNode = actualNode.getNextNode();
		}
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}
	
	public int size(){
		return this.count;
	}
}
