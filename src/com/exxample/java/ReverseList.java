package com.exxample.java;

import java.util.Stack;

public class ReverseList {

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		node = new ListNode(4, node); 
		node = new ListNode(3, node); 
		node = new ListNode(2, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		node = reverseListOptimal(node);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode reverseListOptimal(ListNode head) {
		ListNode prev = null;
		
		while(head != null) {
			ListNode next_node = head.next;
			head.next = prev;
			prev = head;
			head = next_node;	
		}
		return prev;
	}
	
	
	public static ListNode reverseListUsingStack(ListNode head) {
		ListNode dummy = new ListNode(-1);
		Stack<ListNode> list = new Stack<ListNode>();
	
		while(head != null) {
			list.push(head);
			head = head.next;
		}
		head = dummy;
		
		while(!list.isEmpty()) {
			ListNode current = list.pop();
			head.next = new ListNode(current.val);
			head = head.next;
		}
		return dummy.next;
	}
}
