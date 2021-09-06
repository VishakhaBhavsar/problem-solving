package com.exxample.java;

public class RemoveElements {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		
		node = new ListNode(2, node); 
		node = new ListNode(1, node); 
		node = new ListNode(5, node); 
		node = new ListNode(2, node);
		
		printList(node);
		System.out.println(" ");
		node = removeElements(node, 1);
		printList(node);
	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		while(head != null && head.val == val) 
			head = head.next;
		
		if(head == null)
			return head;
		
		ListNode temp = head;
		
		while(temp.next != null) {
			if(temp.next.val == val) {
				temp.next = temp.next.next;
			} else
			temp = temp.next;
		}
		return head;
	}
}

