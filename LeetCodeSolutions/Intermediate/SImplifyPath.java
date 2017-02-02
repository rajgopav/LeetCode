import java.util.Stack;

public class SImplifyPath {
	
	public String simplifyPath(String path) {
		if(path == null || path.length() == 0)
			return "";
		
		String delimiter = "/";
		String arr[] = path.split(delimiter);
		Stack<String> stack = new Stack<String>();
		
		for(String str : arr) {
			if(str.equals("/"))
				continue;
			else if(str.equals("..")) {
				if(!stack.isEmpty())
					stack.pop();
			} else if(!str.equals(".") && !str.isEmpty())
				stack.push(str);
		}
		
		StringBuilder sb = new StringBuilder();
		if(stack.isEmpty())
			return "/";
		
		for(String str : stack)
			sb.append("/" + str);
		
		return sb.toString();
	}
	public static void main(String[] args) {
		SImplifyPath sp = new SImplifyPath();
		String path = "/a/./b/../../c/";
		String result = sp.simplifyPath(path);
		System.out.print(result);
		
	}

}
