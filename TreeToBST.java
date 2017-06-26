package bst;

import java.util.*;

public class TreeToBST {

}

class ConvertTree {
	
	Node buildTree(Node root){
		Vector<Node> nodes = new Vector();
		
		storedNodes(root, nodes);
		
		return buildTreeUtil(nodes, 0, nodes.size()-1);
	}
	
	void storedNodes(Node root, Vector nodes){
		storedNodes(root.left, nodes);
		nodes.add(root);
		storedNodes(root.right, nodes);
	}
	
	Node buildTreeUtil(Vector nodes, int min, int max){
		
		int mid = (min + max) /2;
		
		Node rootNode = (Node)nodes.get(mid);
		
		rootNode.left = buildTreeUtil(nodes, min,mid-1);
		rootNode.right = buildTreeUtil(nodes, mid+1, max);
		
		return rootNode;
		
	}
}