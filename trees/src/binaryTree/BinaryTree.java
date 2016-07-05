package binaryTree;

import java.util.Stack;

public class BinaryTree {

	private TreeNode root;
	private int size;


	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public BinaryTree(){
		root = new TreeNode();
	}

	public BinaryTree(int i){
		root = new TreeNode(i);
		size++;
	}

	public void insert(TreeNode tn,int i){

		/*		if(tn == null){
			tn = new TreeNode(i);
			size++;
		}
		 */


		if(tn.getData() > i){
			if(tn.getLeft() == null){
				tn.setLeft(new TreeNode(i));
			}else{
				insert(tn.getLeft(),i);
			}
		}else if(tn.getData() < i){
			if(tn.getRight() == null){
				tn.setRight(new TreeNode(i));
			}else{
				insert(tn.getRight(),i);
			}
		}

	}

	public void add(int i){
		insert(root,i);
	}


	public void inorder(TreeNode n){

		if(n == null){
			return;
		}

		inorder(n.getLeft());
		System.out.println(n.getData());
		inorder(n.getRight());

	}


	public void preorder(TreeNode n){

		if(n == null){
			return;
		}

		System.out.println(n.getData());
		preorder(n.getLeft());
		preorder(n.getRight());

	}


	public void postorder(TreeNode n){

		if(n == null){
			return;
		}


		postorder(n.getLeft());
		postorder(n.getRight());
		System.out.println(n.getData());
	}



	public void insertIter(TreeNode root, int data){

		//TreeNode node = new TreeNode();

		while(true){
			if(data < root.getData()){
				if(root.getLeft() == null){
					root.setLeft(new TreeNode(data));
					return;
				}else{
					root = root.getLeft();
				}
			}else if(data > root.getData()){
				if(root.getRight() == null){
					root.setRight(new TreeNode(data));
					return;
				}else{
					root = root.getRight();
				}
			}else{
				return;
			}

		}

	}

	public void addIter(int data){
		insertIter(root, data);
	}
	
	
	public void inorderIter(TreeNode root){
		
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.add(root);
		while(true){
			
			if(nodeStack.isEmpty()){
				break;
			}
			
			TreeNode tn = nodeStack.peek();
			
			if(tn.getLeft() != null){
				System.out.println(tn.getData());
				nodeStack.add(tn);
			}
			
			if(tn.getRight() != null){
				nodeStack.add(tn);
			}
			
			nodeStack.pop();
			
		}		
	}

}
