package bst;

public class BalanceTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Node {
	int data;
	Node right;
	Node left;
	Node(int data){
		this.data= data;
		right = left = null;
	}
}
class BinaryTree {
	
	boolean isBalanced(Node root){
		
		if(root == null)
			return false;
		
		int lh = hight(root.left);
		int rh = hight(root.right);
		
		if( Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
		
	}
	
	int hight(Node node){
		return 1+ Math.max(hight(node.left), hight(node.right));
		
	}
	
}
