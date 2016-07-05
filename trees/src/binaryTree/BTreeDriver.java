package binaryTree;

public class BTreeDriver {
	
	
	public static void main(String args[]){
		
		BinaryTree bt = new BinaryTree();
		
		/*	Recursive solution	
		 * bt.add(21);
				bt.add(28);
				bt.add(14);
				bt.add(32);
				bt.add(25);
				bt.add(18);
				bt.add(11);
				bt.add(30);
				bt.add(19);
				bt.add(15);
				
				//System.out.println(bt.getRoot().getRight().getData());
				
				bt.inorder(bt.getRoot());
				System.out.println();
				bt.preorder(bt.getRoot());
				System.out.println();
				bt.postorder(bt.getRoot());*/
			
		// iterative solution
		bt.addIter(21);
		bt.addIter(21);
		bt.addIter(28);
		bt.addIter(14);
		bt.addIter(14);
		
		bt.inorder(bt.getRoot());
		
		
	}

}
