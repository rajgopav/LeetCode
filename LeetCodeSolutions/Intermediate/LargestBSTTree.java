
public class LargestBSTTree {
	
	public int largestBSTSubTree(TreeNodeBST root) {
		return helper(root).size;
	}
	
	public Wrapper helper(TreeNodeBST root) {
		Wrapper current = new Wrapper();
		
		if(root == null) {
			current.isBST = true;
			return current;
		}
		
		Wrapper left = helper(root.left);
		Wrapper right = helper(root.right);
		
		current.lower = Math.min(root.data, left.lower);
		current.upper = Math.max(root.data, right.upper);
		
		if(left.isBST && right.isBST && left.upper <= root.data && right.lower >= root.data) {
			current.size = left.size + right.size + 1;
			current.isBST = true;
		} else {
			current.size = Math.max(left.size, right.size);
			current.isBST = false;
		}
		
		return current;
	}
}

class TreeNodeBST {
	int data;
	TreeNodeBST left;
	TreeNodeBST right;
	
	public TreeNodeBST(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Wrapper {
	int size;
	int lower, upper;
	boolean isBST;
	
	public Wrapper() {
		size = 0;
		lower = Integer.MAX_VALUE;
		upper = Integer.MIN_VALUE;
		isBST = false;
	}
}
