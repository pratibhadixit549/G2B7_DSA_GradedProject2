package Problem2;

class InputTree {

	// Initialising variable
	static TreeNode node;

	static void userInput() {
		InputTree tree = new InputTree();
		tree.node = new TreeNode(10);
		tree.node.left = new TreeNode(5);
		tree.node.left.left = new TreeNode(1);
		tree.node.left.right = new TreeNode(6);
		tree.node.right = new TreeNode(12);
		tree.node.right.left = new TreeNode(11);
		tree.node.right.right = new TreeNode(15);

		// Converting BST to Right Skewed Tree
		new BSTToSkewed();
		BSTToSkewed.bstToRightSkewedTree(node);

		// Printing Right Skewed Tree node values present in ascending order
		BSTToSkewed.printSkewedTree();

	}

}
