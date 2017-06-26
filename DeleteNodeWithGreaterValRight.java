package linkedlist;

import linkedlist.LinkedListReverse.Node;

public class DeleteNodeWithGreaterValRight {

	static Node head1;

    static class Node 
    {
        int data;
        Node next;
 
        Node(int d) 
        {
            data = d;
            next = null;
        }
        public Node() 
        {
        	
        }
    }
    
    private int maxFound = Integer.MIN_VALUE;
    
    public Node deleteNodes(Node head){
        if(head == null){
            return null;
        }
        Node nextNode = deleteNodes(head.next);
        if(head.data > maxFound){
            maxFound = head.data;
        }
        if(maxFound > head.data){
            return nextNode;
        }
        head.next = nextNode;
        return head;
    }
    
    public void rotate(Node head, int k) {
    	
    	Node current = head;
    	int count = 1;
    	
    	while (current !=null & count < k) {
			current = current.next;
			count++;
		}
    	
    	Node kthNode = current;
    	
    	while (current !=null) {
    		current = current.next;
    	}
    	head = kthNode.next;
    	
    	current.next =head;
    	
    	
    }
    
    public static void main(String args[]){
    	DeleteNodeWithGreaterValRight llist = new DeleteNodeWithGreaterValRight();

    	 llist.head1 = new Node(12);
         llist.head1.next = new Node(15);
         llist.head1.next.next = new Node(10);
         llist.head1.next.next.next = new Node(11);
         llist.rotate(head1,2);
    }
}
