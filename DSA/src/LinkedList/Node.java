package LinkedList;

public class Node <T extends Comparable<T>>{
	private T data;
	private Node<T> nextNode;
	
	
	public void insert (T newData){
		
		if (this.getNextNode() != null){
			this.nextNode.insert(newData);
		}else{
			this.nextNode = new Node<>(newData);
		}
	}
	
	public void remove (T dataToRemove, Node<T> previousNode){
		if (this.data.compareTo(dataToRemove) == 0){
			previousNode.setNextNode(getNextNode());
			this.data = null;
			this.nextNode = null;
		}else{
			if(getNextNode() != null){
				getNextNode().remove(dataToRemove, this);
			}
		}
	}
	
	public Node(T data) {
		super();
		this.data = data;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the nextNode
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}