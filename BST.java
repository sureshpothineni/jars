package algorithms;

public class BST {
	static Node root;
	
	public void find(int id){
		Node current = root;
		while(current!=null){
			if (id == current.data){
				// return value
			} else if (id < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
	}
	
	public void delete(int id) {
		Node current = root;
		Node parent = null;
		boolean isLeftChild = false;
		while (current.data != id) {
			parent = current;
			if (id < current.data){
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
		}
		
		if (current.right == null) {
			if(current == root)
				root = current.left;
			if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left == null) {
			if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.right == null && current.left == null) {
			if (current == root) {
				root = null;
			}
			if(isLeftChild){
				parent.left = null;
			} else {
				parent.right = null;
			}
		} else if (current.right!=null && current.left != null) {
			
		}
		
	}
	
	public void insert(int id){
		Node data = new Node(id);
		
		if (root == null)
			root = data;
		Node current = root;
		Node parent = null;
		while (true){
			parent = current;
			if (id < current.data){
				current = current.left;
				if(current == null){
					parent.left = data;
					break;
				}
			} else {
				current = current.right;
				if(current == null){
					parent.right = data;
					break;
				}
			}
		}
		
	}
}

class Node{
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
