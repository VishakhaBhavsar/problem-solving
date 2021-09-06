package com.exxample.java;

public class RotateListRight {

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		node = new ListNode(4, node); 
		node = new ListNode(3, node); 
		node = new ListNode(2, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		node = rotateRight(node, 2);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode rotateRight(ListNode head, int k) {
		ListNode oldhead = head;
		if(head == null) 
			return null;
		int count = 1;
		while(oldhead.next != null) {
			count++;
			oldhead = oldhead.next;
		}
		oldhead.next = head;
		k = k % count;
		
		ListNode newtail = oldhead;
		int stepforward = count - k;
		while(stepforward-- > 0) {
			newtail = newtail.next;
		}
		
		ListNode newhead = newtail.next;
		newtail.next = null;
		
		return newhead;
    }
}
