package StackArray;

public class App {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Parva");
		stack.push("Isha");
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}
