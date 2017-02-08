import java.util.LinkedList;

public class MinimumDepthBT {
	
	public static int MinDepth(MinNode root) {
		if(root == null) {
			return 0;
		}
		
		LinkedList<MinNode> nodes = new LinkedList<MinNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		
		nodes.add(root);
		counts.add(1);
		while(!nodes.isEmpty()) {
			MinNode node = nodes.remove();
			int count = counts.remove();
			
			if(node.left == null && node.right == null) {
				return count;
			}
			
			if(node.left != null) {
				nodes.add(node.left);
				counts.add(count+1);
			}
			
			if(node.right != null) {
				nodes.add(node.right);
				counts.add(count+1);
			}
		}
		
		return 0;
	}
}

class MinNode {
	int value;
	MinNode left;
	MinNode right;
	
	public MinNode(int data) {
		this.value = data;
		this.left = null;
		this.right = null;
	}
}