
public class LowestCommonAncestorBT {

	public static void main(String[] args) {
		NodeAncestorBT root  = new NodeAncestorBT(1);
		root.left = new NodeAncestorBT(2);
		root.right = new NodeAncestorBT(3);
		root.left.left = new NodeAncestorBT(4);
		NodeAncestorBT n3 = new NodeAncestorBT(5);
		root.left.right = n3;
		root.right.left = new NodeAncestorBT(6);
		root.right.right = new NodeAncestorBT(7);
		NodeAncestorBT n1 = new NodeAncestorBT(8);
		root.left.left.left = n1;
		root.left.left.right = new NodeAncestorBT(9);
		root.left.right.left = new NodeAncestorBT(10);
		root.left.right.right = new NodeAncestorBT(20);

		root.left.right.left.left = new NodeAncestorBT(11);
		NodeAncestorBT n2 = new NodeAncestorBT(30);
		root.left.right.left.right = n2 ;
		
		LowestCommonAncestorBT lca = new LowestCommonAncestorBT();
		NodeAncestorBT result = lca.lowestCommonAncestor(root, n1, n2);
		System.out.println("Lowest Common Ancestor ("+n1.data+", "+ n2.data +" ) is " + result.data);
		result = lca.lowestCommonAncestor(root,n2,n3);
		System.out.println("Lowest Common Ancestor ("+n2.data+", "+ n3.data +" ) is " + result.data);
	}
	
	public NodeAncestorBT lowestCommonAncestor(NodeAncestorBT root, NodeAncestorBT node1, NodeAncestorBT node2) {
		if(root == null) {
			return null;
		} else {
			
			if(root.data == node1.data || root.data == node2.data) {
				return root;
			}
			
			NodeAncestorBT left = lowestCommonAncestor(root.left, node1, node2);
			NodeAncestorBT right = lowestCommonAncestor(root.right, node1, node2);
			
			if(left != null && right != null) {
				return root;
			}
			
			if(left != null) {
				return left;
			} else if(right != null) {
				return right;
			}
			
			return null;
		}
	}
}

class NodeAncestorBT {
	int data;
	NodeAncestorBT left;
	NodeAncestorBT right;
	
	public NodeAncestorBT(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
