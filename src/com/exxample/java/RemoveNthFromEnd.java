package com.exxample.java;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		node = new ListNode(4, node); 
		node = new ListNode(3, node); 
		node = new ListNode(2, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		node = removeNthFromEnd(node, 2);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;
       
       ListNode slow = dummy;
       ListNode fast = dummy;
    		   
       for(int i = 1; i <= n+1; i++) {
    	   fast = fast.next;
       }
       
       while(fast != null) {
    	   slow = slow.next;
    	   fast = fast.next;
       }
       slow.next = slow.next.next;
       
       return dummy.next;
    }
}
