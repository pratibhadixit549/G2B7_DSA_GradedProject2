package Problem2;

class BSTToSkewed {

	// Initialising variables
	static TreeNode headNode = null;
	static TreeNode prevNode = null;

	static void bstToRightSkewedTree(TreeNode curr) {

		/*
		 * Base case, when the tree is empty we just return
		 */
		if (curr == null) {
			return;
		}

		/*
		 * we need to construct the skewed tree in increasing order, so we traverse the
		 * left subtree first followed by the root and then the right subtree
		 */

		bstToRightSkewedTree(curr.left);

		/*
		 * Storing the reference to the right subtree so that we do not lose it's
		 * reference while adjusting the pointers
		 */
		TreeNode rightSubTree = curr.right;

		/*
		 * Adjusting the pointers to construct the desired tree (skewed)
		 */
		if (headNode == null) {
			headNode = curr;
			prevNode = curr;
		} else {
			prevNode.right = curr;
			curr.left = null;
			prevNode = curr;
		}

		bstToRightSkewedTree(rightSubTree);

	}

	static void printSkewedTree() {
		new TraverseSkewedTree();
		TraverseSkewedTree.traverseSkewedTree(headNode);
	}

}
