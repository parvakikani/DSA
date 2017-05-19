package Stacks;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> nextNode;
	
	public Node (T data){
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		
		return this.data.toString();
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
