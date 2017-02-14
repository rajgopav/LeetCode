
public class LowestCommonAncestorBST {

	public static void main(String[] args) {
		NodeAncestor root = new NodeAncestor(15);
		root.left = new NodeAncestor(10);
		root.right = new NodeAncestor(20);
		NodeAncestor n1 = new NodeAncestor(5);
		root.left.left = n1;
		root.left.right = new NodeAncestor(13);
		NodeAncestor n2 = new NodeAncestor(14);
		root.left.right.right = n2;
		root.left.right.left = new NodeAncestor(12);
		
		LowestCommonAncestorBST lca = new LowestCommonAncestorBST();
		NodeAncestor result = lca.lowestCommonAncestorRecursive(root, n1, n2);
		System.out.println("The lowest common ancestor is: " + result.data);
		
		result = lca.lowestCommonAncestorIterative(root, n1, n2);
		System.out.println("The lowest common ancestor is: " + result.data);
	}
	
	public NodeAncestor lowestCommonAncestorRecursive(NodeAncestor root, NodeAncestor node1, NodeAncestor node2) {
		NodeAncestor current = root;
		
		if(root == null)
			return null;
		
		if(current.data > node1.data && current.data < node2.data) {
			return current;
		} else if (current.data > node1.data && current.data > node2.data) {
			return lowestCommonAncestorRecursive(current.left, node1, node2);
		} else if (current.data < node1.data && current.data < node2.data) {
			return lowestCommonAncestorRecursive(current.right, node1, node1);
		}
		
		return root;
	}
	
	public NodeAncestor lowestCommonAncestorIterative(NodeAncestor root, NodeAncestor node1, NodeAncestor node2) {
		NodeAncestor current = root;
		
		while(current != null) {
			if(current.data > node1.data && current.data < node2.data) {
				return current;
			} else if (current.data > node1.data && current.data > node2.data) {
				current = current.left;
			} else if (current.data < node1.data && current.data < node2.data) {
				current = current.right;
			}
		}
		
		return root;
	}
}

class NodeAncestor {
	int data;
	NodeAncestor left;
	NodeAncestor right;
	
	public NodeAncestor(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
