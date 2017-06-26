package linkedlist;

public class LinkedListReverse {
	static Node head1;
	Node head;  // head of list
    Node slow_ptr, fast_ptr,second_half;
 
    /* Linked list Node*/
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
 
    /* Function to check if given linked list is
       palindrome or not */
    boolean isPalindrome(Node head) 
    {
        slow_ptr = head; fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midnode = null;  // To handle odd size list
        boolean res = true; // initialize result
 
        if (head != null && head.next != null) 
        {
            /* Get the middle of the list. Move slow_ptr by 1
               and fast_ptrr by 2, slow_ptr will have the middle
               node */
            while (fast_ptr != null && fast_ptr.next != null) 
            {
                fast_ptr = fast_ptr.next.next;
 
                /*We need previous of the slow_ptr for
                  linked lists  with odd elements */
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
 
            /* fast_ptr would become NULL when there are even elements 
               in the list and not NULL for odd elements. We need to skip  
               the middle node for odd case and store it somewhere so that
               we can restore the original list */
            if (fast_ptr != null) 
            {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
 
            // Now reverse the second half and compare it with first half
            second_half = slow_ptr;
            prev_of_slow_ptr.next = null; // NULL terminate first half
            reverse();  // Reverse the second half
            res = compareLists(head, second_half); // compare
 
            /* Construct the original list back */
            reverse(); // Reverse the second half again
             
            if (midnode != null) 
            {
                // If there was a mid node (odd size case) which                                                         
                // was not part of either first half or second half.
                prev_of_slow_ptr.next = midnode;
                midnode.next = second_half;
            } else
                prev_of_slow_ptr.next = second_half;
        }
        return res;
    }
 
    /* Function to reverse the linked list  Note that this
       function may change the head */
    void reverse() 
    {
        Node prev = null;
        Node current = second_half;
        Node next;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second_half = prev;
    }
 
    /* Function to check if two input lists have same data*/
    boolean compareLists(Node head1, Node head2) 
    {
        Node temp1 = head1;
        Node temp2 = head2;
 
        while (temp1 != null && temp2 != null) 
        {
            if (temp1.data == temp2.data) 
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else
                return false;
        }
 
        /* Both are empty reurn 1*/
        if (temp1 == null && temp2 == null)
            return true;
 
        /* Will reach here when one is NULL
           and other is not */
        return false;
    }
 
    /* Push a node to linked list. Note that this function
       changes the head */
    public void push(char new_data) 
    {
        /* Allocate the Node &
           Put in the data */
        Node new_node = new Node(new_data);
 
        /* link the old list off the new one */
        //new_node.next = head;
 
        /* Move the head to point to new Node */
        if (head == null)
        	head = new_node;
        else 
        	head.next = new_node;
    }
 
    // A utility function to print a given linked list
    void printList(Node ptr) 
    {
        while (ptr != null) 
        {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
 
    boolean isPalindrome1(Node head) 
    {
    	if(head == null)
    		return true;
    	Node p = head;
    	Node prev = null;//new Node(p.data);
    	
    	while(p.next != null){
    		Node temp = null;//new Node(p.next.data);
    		temp.next = prev;
    		prev = temp;
    		p = p.next;
    	}
    	
        Node prev1 = null;
        Node current = head;
        Node next;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev1 = current;
            current = next;
        }

    	
    	return true;
    }
    
    public void delLesserNodes(Node head)
    {
        Node current = head;
 
        /* Initialise max */
        Node maxnode = head;
        Node temp;
 
        while (current != null && current.next != null)
        {
            /* If current is smaller than max, then delete
               current */
            if (current.next.data < maxnode.data)
            {
                temp = current.next;
                current.next = temp.next;
                temp = null;
            }
 
            /* If current is greater than max, then update
               max and move current */
            else
            {
                current = current.next;
                maxnode = current;
            }
        }
    }

    public void remove_duplicates(Node head) {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
    public void deleteAlt(Node head) {
    	Node prev = head;
    	Node now = head.next;
    	
    	while(prev != null) {
    		prev.next = now.next;
    		
    		now =null;
    		prev = prev.next;
    		if(prev!=null){
    			now = prev.next;
    		}
    	}
    	
    }
    
    
    public Node sort(Node head){
        Node result = null;
        Node start = head;
        while(head != null && head.next != null){
            if(head.data < head.next.data){
                head = head.next;
            }else{
                Node temp = head.next;
                head.next = null;
                result = mergeSort(result,start);
                head = temp;
                start = temp;
            }
        }
        result = mergeSort(result,start);
        return result;
    }
    
    private Node mergeSort(Node head1,Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.data <= head2.data){
            head1.next = mergeSort(head1.next,head2);
            return head1;
        }else{
            head2.next = mergeSort(head1,head2.next);
            return head2;
        }
    }
    
    public void deletedNodes(Node head, int num) {
    	
    	Node tmp = head;
    	
    	while(tmp !=null) {
    		if(tmp.data == tmp.next.data) {
    			tmp.next = tmp.next.next;
    		} else {
    			tmp = tmp.next;
    		}
    	}
    }
    
    public void printAlt(Node head) {
    	if(head == null)
    	    return;
    	printAlt(head.next.next);
    	System.out.println(head.data);
    }
    /* Driver program to test the above functions */
    public static void main(String[] args) {
         
        /* Start with the empty list */
        LinkedListReverse llist = new LinkedListReverse();
 
        char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
        String string = new String(str);
        
        //llist.push('a');
        //llist.push('b');
        //llist.push('a');
        llist.head1 = new Node(11);
        llist.head1.next = new Node(12);
        llist.head1.next.next = new Node(13);
        llist.head1.next.next.next = new Node(14);
        //llist.head1.next.next.next = new Node('a')
        llist.printAlt(llist.head1);
        //llist.deletedNodes(llist.head1, 15);
        //System.out.println(llist.sort(llist.head1));
        //System.out.println(llist.head1.data+" "+llist.head1.next.data);
        
        //llist.deleteAlt(llist.head1);
        //llist.isPalindrome1(llist.head1);
        
        /*for (int i = 0; i< 7 ; i++) {
            llist.push(str[i]);
            llist.printList(llist.head);
            if (llist.isPalindrome(llist.head) != false) 
            {
                System.out.println("Is Palindrome");
                System.out.println("");
            }
             else
            {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
        }*/
    }
}
