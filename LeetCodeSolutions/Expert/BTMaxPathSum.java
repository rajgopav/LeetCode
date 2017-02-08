
public class BTMaxPathSum {

	public static int maxPathSum(MaxNode root) {
		int max[] = new int[1];
		max[0] = Integer.MIN_VALUE;
		calculateSum(root, max);
		return max[0];
	}
	
	private static int calculateSum(MaxNode root, int max[]) {
		
		if(root == null)
			return 0;
		
		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);
		
		int current = Math.max(root.data, Math.max(root.data + left, root.data + right));
		max[0] = Math.max(max[0], Math.max(current, root.data + left + right));
		
		return current;
	}
}

class MaxNode {
	int data;
	MaxNode left;
	MaxNode right;
	
	public MaxNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
