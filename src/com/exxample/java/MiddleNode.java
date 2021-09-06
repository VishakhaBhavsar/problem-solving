package com.exxample.java;

import java.util.Stack;

public class MiddleNode {

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		node = new ListNode(4, node); 
		node = new ListNode(3, node); 
		node = new ListNode(2, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		node = middleNode(node);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
}
