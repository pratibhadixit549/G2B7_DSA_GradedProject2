package Problem2;

class TraverseSkewedTree {
	// Function to traverse the right
	// skewed tree using recursion
	static void traverseSkewedTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseSkewedTree(root.right);
	}
}
