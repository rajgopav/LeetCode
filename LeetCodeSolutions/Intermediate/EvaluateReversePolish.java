import java.util.Stack;

public class EvaluateReversePolish {
	
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		String operators = "+-*/";
		for(String token: tokens) {
			if(!operators.contains(token)) {
				stack.push(Integer.valueOf(token));
			} else {
				int index = operators.indexOf(token);
				int a = stack.pop();
				int b = stack.pop();
				switch(index) {
					case 0: stack.push(a+b);
							break;
					case 1: stack.push(b-a);
							break;
					case 2: stack.push(a*b);
							break;
					case 3: stack.push(b/a);
							break;
				}
			}
		}
		
		int result = stack.pop();
		return result;
	}
	
	public static void main(String[] args) {
		String tokens[] = {"4", "13", "5", "/", "+"};
		int result = evalRPN(tokens);
		System.out.println(result);
	}
}
