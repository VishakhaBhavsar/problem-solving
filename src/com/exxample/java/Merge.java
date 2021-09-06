package com.exxample.java;

public class Merge {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(12);
		node1 = new ListNode(10, node1); 
		node1 = new ListNode(9, node1); 
		node1 = new ListNode(6, node1); 
		node1 = new ListNode(5, node1);
		node1 = new ListNode(3, node1); 
		node1 = new ListNode(1, node1); 
		node1 = new ListNode(1, node1);
		
		ListNode node2 = new ListNode(11);
		node2 = new ListNode(8, node2); 
		node2 = new ListNode(5, node2); 
		node2 = new ListNode(4, node2); 
		node2 = new ListNode(4, node2);
		node2 = new ListNode(2, node2); 
		node2 = new ListNode(0, node2);
		
		printList(node1);
		System.out.println("");
		printList(node2);
		System.out.println("");
		node1 = mergeTwoLists(node1, node2);
		printList(node1);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) { 
		ListNode head = new ListNode(-1);
		ListNode dummy = head;
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			} else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
		}
		
		if(l1 != null)
			dummy.next = l1;
		else
			dummy.next = l2;
		
		return head.next;
	}
}
