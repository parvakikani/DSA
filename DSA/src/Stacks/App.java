package Stacks;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(3);
		stack.push(5);
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
