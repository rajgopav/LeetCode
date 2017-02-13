import java.util.Stack;

public class PreOrderSerialization {

	public static void main(String[] args) {
		PreOrderSerialization ps = new PreOrderSerialization();
		String str = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		boolean result = ps.isValid(str);
		System.out.print(result);
	}
	
	public boolean isValid(String result) {
		Stack<String> stack = new Stack<String>();
		String arr[] = result.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
			
			while(stack.size() >= 3 
					&& stack.get(stack.size()-1).equals("#")
					&& stack.get(stack.size()-2).equals("#")
					&& !stack.get(stack.size()-3).equals("#")) {
					
				stack.pop();
				stack.pop();
				stack.pop();
				stack.push("#");
			}
		}
		
		if(stack.size() == 1 || stack.get(0).equals("#"))
			return true;
		else 
			return false;
	}
}
