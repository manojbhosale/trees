package binaryTree;

public class BinaryTreeNode<T> {
	
	private T data;
	private BinaryTreeNode<T> leftNode;
	private BinaryTreeNode<T> rightNode;
		
	public BinaryTreeNode(){
		
	}
	
	public BinaryTreeNode(T dt, BinaryTreeNode<T> ln, BinaryTreeNode<T> rn){
		data = dt;
		leftNode = ln;
		rightNode = rn;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	
	

}
