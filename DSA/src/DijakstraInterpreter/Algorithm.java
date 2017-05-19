package DijakstraInterpreter;

import java.util.Stack;

public class Algorithm {
	private Stack<String> operationStack;
	private Stack<Double> valueStack;

	public Algorithm(){
		this.operationStack = new Stack<String>();
		this.valueStack = new Stack<Double>();
	}

	public void interpretExpression(String expression){
		char[] expressionChars = expression.toCharArray();

		for (char c : expressionChars){
			if (c == '('){
				// do nothing!!
			}
			if (c == '*'){
				this.operationStack.push(String.valueOf(c));
			}
			if (c == '+'){
				this.operationStack.push(String.valueOf(c));
			}
			if (c == '-'){
				this.operationStack.push(String.valueOf(c));
			}
			if (c == '/'){
				this.operationStack.push(String.valueOf(c));
			}
			if (Character.isDigit(c)){
				this.valueStack.push(Double.valueOf(String.valueOf(c)));
			}
			if(c == ')'){
				//while (!this.operationStack.isEmpty()){
					String operator = this.operationStack.pop();

					if(operator.equals("*")){
						this.valueStack.push((this.valueStack.pop() * this.valueStack.pop()));
					}
					if(operator.equals("+")){
						this.valueStack.push((this.valueStack.pop() + this.valueStack.pop()));
					}
					if(operator.equals("-")){
						this.valueStack.push(-(this.valueStack.pop() - this.valueStack.pop()));
					}
					if(operator.equals("/")){
						this.valueStack.push((this.valueStack.pop() / this.valueStack.pop()));
					}
				//}
			}
		}
	}
	
	public void Result(){
		System.out.println(this.valueStack.pop());
	}

}
