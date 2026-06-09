package pekan9_2511533015;

public class BTree_2511533015 {
	private Node_2511533015 root;
	private Node_2511533015  currentNode_2511533015;
	public BTree_2511533015 () {
		root = null;
	}
	public boolean search (int data) {
		return search (root, data);
	}
	private boolean search (Node_2511533015 node, int data) {
		if (node.getData () == data)
			return true;
		if (node.getLeft () != null)
			if (search (node.getLeft (), data))
					return true;
			if (node.getRight () != null)
				if (search (node.getRight() , data))
					return true;
			return false;
			}
	public void printInorder () {
		root.printInorder(root);
	}
	public void printPreOrder () {
		root.printPreorder (root);
	}
	public void printPostOrder () {
		root.printPostorder (root);
	}
	public Node_2511533015 getRoot () {
		return root;
	}
	public boolean isEmpty () {
		return root == null;
	}
	public int countNodes () {
		return countNodes (root);
	}
	private int countNodes (Node_2511533015 node) {
		int count = 1;
		if (node == null) {
			return 0;
		} else {
			count += countNodes (node.getLeft ());
			count += countNodes (node.getRight ());
			return count;
		}
	}
	public void print () {
		root.print ();
	}
	public Node_2511533015 getCurrent () {
		return currentNode_2511533015;
	}
	public void setCurrent (Node_2511533015 node) {
		this.currentNode_2511533015 = node;
	}
	public void setRoot (Node_2511533015 root) {
		this.root = root;
	}
}
