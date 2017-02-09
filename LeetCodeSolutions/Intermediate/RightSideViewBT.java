import java.util.*;

public class RightSideViewBT {

	public static void main(String[] args) {

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
