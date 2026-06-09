package pekan9_2511533015;

public class Node_2511533015 {
int data;
Node_2511533015 left;
Node_2511533015 right;
public Node_2511533015 (int data) {
	this.data = data;
	left = null;
	right = null;
}
public void setLeft (Node_2511533015 node) {
	if (left== null)
		left = node;
}
public void setRight (Node_2511533015 node) {
	if (right== null)
		right = node;
}
public Node_2511533015 getLeft (){
	return left;
}
public Node_2511533015 getRight() {
	return right;
}
public int getData() {
	return data;
}
public void setData (int data) {
	this.data = data;
}
void printPreorder (Node_2511533015 node) {
	if (node == null)
		return;
	System.out.print(node.data + " ");
	printPreorder (node.left);
	printPreorder (node.right);
}
void printPostorder (Node_2511533015 node) {
	if (node == null)
		return;
	printPostorder (node.left);
	printPostorder (node.right);
	System.out.print (node.data + " ");
}
void printInorder (Node_2511533015 node) {
	if (node == null)
		return;
	printInorder (node.left);
	System.out.print(node.data + " ");
	printInorder (node.right);
}
public String print () {
	return this.print ("", true, "");
}
public String print (String prefix, boolean isTail, String sb ) {
	if (right != null) {
		right.print (prefix + (isTail ? "| " : " "), false, sb);
	}
	System.out.println (prefix + (isTail ? " \\--": "/--")+ data);
	if (left != null) {
		left.print (prefix + (isTail ? " " : "| "), true, sb);
	}
	return sb;
	}
	
	
}
