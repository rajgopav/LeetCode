import java.util.*;

public class RightSideViewBT {

	public static void main(String[] args) {
		RViewNode root = new RViewNode(5);
		root.left = new RViewNode(10);
		root.right = new RViewNode(15);
		root.left.left = new RViewNode(20);
		root.left.right = new RViewNode(25);
		root.right.left = new RViewNode(30);
		root.right.right = new RViewNode(35);
		root.left.right.right = new RViewNode(45);
		
		RightSideViewBT rv = new RightSideViewBT();
		List<RViewNode> result = rv.rightSideView(root);
		result.forEach(node -> System.out.println(node.data));
	}
	
	public List<RViewNode> rightSideView(RViewNode root) {
		ArrayList<RViewNode> result = new ArrayList<RViewNode>();
		
		if(root == null)
			return result;
		
		Queue<RViewNode> queue = new LinkedList<RViewNode>();
		queue.add(root);
		while(queue.size() > 0) {
			int size = queue.size();
			
			for(int i = 0; i < size; i++) {
				RViewNode node = queue.poll();
				
				if(i == 0) {
					result.add(node);
				}
				
				if(node.right != null) {
					queue.add(node.right);
				}
				
				if(node.left != null) {
					queue.add(node.left);
				}
			}
		}
		return result;
	}
}

class RViewNode {
	int data;
	RViewNode left;
	RViewNode right;
	
	public RViewNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
