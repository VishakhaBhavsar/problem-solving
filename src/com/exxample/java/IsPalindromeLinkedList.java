package com.exxample.java;

import java.util.Stack;

public class IsPalindromeLinkedList {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node = new ListNode(2, node); 
		node = new ListNode(3, node); 
		node = new ListNode(2, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		System.out.println(isPalindromeTwoPointer(node));
	
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static boolean isPalindromeTwoPointer(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
	
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reversed(slow);
		fast = head;
		
		while(slow != null) {
			if(slow.val != fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
	public static ListNode reversed(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode next_node = head.next;
			head.next = prev;
			prev = head;
			head = next_node;
		}
		return prev;
	}

	public static boolean isPalindrome(ListNode head) {
        ListNode right = head;
        ListNode left = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(left != null){
            stack.push(left);
            left = left.next;
        }
        int length = stack.size()/2;
        int i = 1; 
        int j = stack.size();
        while(i < j && i <= length){
            int r = stack.pop().val;
            if(r != right.val)
                return false;
            right = right.next;
            i++; j--;
        }
        return true;   
    }

}
