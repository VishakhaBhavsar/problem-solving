package com.exxample.java;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(9);
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(9, node1); 
		
		ListNode node2 = new ListNode(9);
		node2 = new ListNode(9, node2); 
		node2 = new ListNode(9, node2); 
		node2 = new ListNode(9, node2); 
			
		printList(node1);
		System.out.println(" ");
		printList(node2);
		System.out.println(" ");
		node1 = addTwoNumbers(node1, node2);
		printList(node1);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode result = new ListNode();
		 ListNode dummy = result;
		 int carry = 0;
		 while(l1 != null || l2 != null || carry != 0) {
			 int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
			 carry = sum / 10;
			 dummy.next = new ListNode(sum % 10);
			 dummy = dummy.next;
			 if(l1 != null) l1 = l1.next;
			 if(l2 != null)  l2 = l2.next;
		 }
		 return result.next;
	 }
}
