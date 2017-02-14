import java.util.*;

public class BTPaths {
	
	public List<String> binaryTreePaths(NodeBT root) {
		ArrayList<String> finalResult = new ArrayList<String>();
		
		if(root == null)
			return finalResult;
		
		ArrayList<String> current = new ArrayList<String>();
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		
		dfs(root, results, current);
		
		for(ArrayList<String> al : results) {
			StringBuilder sb = new StringBuilder();
			sb.append(al.get(0));
			for(int i = 0; i < al.size(); i++) {
				sb.append("->" + al.get(i));
			}
			finalResult.add(sb.toString());
		}
		
		return finalResult;
	}
	
	private void dfs(NodeBT root, ArrayList<ArrayList<String>> list, ArrayList<String> curr) {
		curr.add(String.valueOf(root.data));
		
		if(root.left == null && root.right == null) {
			list.add(curr);
		}
		
		if(root.left != null) {
			ArrayList<String> temp = new ArrayList<String>(curr);
			dfs(root.left, list, temp);
		}
		
		if(root.right != null) {
			ArrayList<String> temp = new ArrayList<String>(curr);
			dfs(root.right, list, temp);
		}
	}
}

class NodeBT {
	int data;
	NodeBT left;
	NodeBT right;
	
	public NodeBT(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
