package DijakstraInterpreter;

public class App {

	public static void main(String[] args) {
		String expression = "((3+9)*(6-2))";
		Algorithm algo = new Algorithm();
		algo.interpretExpression(expression);
		algo.Result();

	}

}
