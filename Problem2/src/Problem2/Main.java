package Problem2;

public class Main {

	// Initialising variable
	static TreeNode node;

	// Entry point
	public static void main(String[] args) {

		new Main();
		Main.node = new TreeNode(10);
		Main.node.left = new TreeNode(5);
		Main.node.left.left = new TreeNode(1);
		Main.node.left.right = new TreeNode(6);
		Main.node.right = new TreeNode(12);
		Main.node.right.left = new TreeNode(11);
		Main.node.right.right = new TreeNode(15);

		// Converting BST to Right Skewed Tree
		new BSTToSkewed();
		BSTToSkewed.bstToRightSkewedTree(node);

		// Printing Right Skewed Tree node values present in ascending order
		BSTToSkewed.printSkewedTree();

	}

}
