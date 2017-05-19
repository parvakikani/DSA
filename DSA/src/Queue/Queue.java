package Queue;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	
	public boolean isEmpty(){
		return this.firstNode == null;
	}
	
	public int size(){
		return this.count;
	}
	
	public void enqueue(T newData){
		this.count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(newData);
		this.lastNode.setNextNode(null);
		
		if(this.isEmpty()){
			this.firstNode = this.lastNode;
		}else{
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue(){
		T dataToReturn = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if(this.isEmpty()){
			this.lastNode = null;
		}
		this.count--;
		return dataToReturn;
	}

}
