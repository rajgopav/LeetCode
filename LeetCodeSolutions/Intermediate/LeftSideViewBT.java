import java.util.*;

public class LeftSideViewBT {

	public static void main(String[] args) {
		LViewNode root = new LViewNode(5);
		root.left = new LViewNode(10);
		root.right = new LViewNode(15);
		root.left.left = new LViewNode(20);
		root.left.right = new LViewNode(25);
		root.right.left = new LViewNode(30);
		root.right.right = new LViewNode(35);
		root.left.right.right = new LViewNode(45);

		LeftSideViewBT rv = new LeftSideViewBT();
		List<LViewNode> result = rv.leftSideView(root);
		result.forEach(node -> System.out.println(node.data));
	}

	public List<LViewNode> leftSideView(LViewNode root) {
		ArrayList<LViewNode> result = new ArrayList<LViewNode>();

		if(root == null)
			return result;

		Queue<LViewNode> queue = new LinkedList<LViewNode>();
		queue.add(root);
		while(queue.size() > 0) {
			int size = queue.size();

			for(int i = 0; i < size; i++) {
				LViewNode node = queue.poll();

				if(i == 0) {
					result.add(node);
				}

				if(node.left != null) {
					queue.add(node.left);
				}

				if(node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return result;
	}
}

class LViewNode {
	int data;
	LViewNode left;
	LViewNode right;

	public LViewNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
