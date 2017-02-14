
public class ClosestValue {
	
	public int closestValue(NodeClosest root, int target) {
		int min = Integer.MAX_VALUE;
		int result = root.data;
		
		while(root!=null) {
			if(target > root.data) {
				int diff = Math.abs(target - root.data); 
				if(diff < min) {
					min = Math.min(min, diff);
					result = root.data;
				}
				root = root.right;
			} else if (target < root.data) {
				int diff = Math.abs(target - root.data);
				if(diff < min) {
					min = Math.min(min, diff);
					result = root.data;
				}
				root = root.left;
			} else {
				return root.data;
			}
		}
		return result;
	}
}

class NodeClosest {
	int data;
	NodeClosest left;
	NodeClosest right;
	
	public NodeClosest(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
