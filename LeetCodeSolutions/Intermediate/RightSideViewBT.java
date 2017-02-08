import java.util.*;

public class RightSideViewBT {

	public static void main(String[] args) {

	}
	
	public List<RViewNode> rightSideView(RViewNode root) {
		ArrayList<RViewNode> result = new ArrayList<RViewNode>();
		
		if(root == null)
			return result;
		
		Queue<RViewNode> queue = new LinkedList<RViewNode>();
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
