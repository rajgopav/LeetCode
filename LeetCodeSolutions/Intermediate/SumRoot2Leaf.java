import static org.junit.Assert.*;
import org.junit.Test;
public class SumRoot2Leaf {
	
	@Test
	public void solve() {
		SumRoot2Leaf sl = new SumRoot2Leaf();
		
		NodeSum s1 = new NodeSum(1);
		NodeSum s2 = new NodeSum(2);
		NodeSum s3 = new NodeSum(3);
		
		s1.left = s2;
		s1.right = s3;
		
		int result = sl.sumNumbers(s1);
		assertEquals(25, result);
	}
	
	public int sumNumbers(NodeSum root) {
		if(root == null)
			return 0;
		
		return dfs(root, 0, 0);
	}
	
	private int dfs(NodeSum root, int num, int sum) {
		if(root == null) return sum;
		
		num = num * 10 + root.data;
		
		if(root.left == null && root.right == null) {
			sum += num;
			return sum;
		}
		
		sum = dfs(root.left, num, sum) + dfs(root.right, num, sum);
		return sum;
	}
}

class NodeSum {
	int data;
	NodeSum left;
	NodeSum right;
	
	public NodeSum(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}