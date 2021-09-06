package com.exxample.java;
public class SwapNodes {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);		
		printList(node);
		System.out.println(" ");
		node = swapNodesOptimal(node, 1);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode swapNodesOptimal(ListNode head, int k) {
		ListNode begining = head;
		ListNode dummy = head;
		ListNode end = head;
		while(--k > 0) {
			begining = begining.next;
			dummy = dummy.next;
		}		
		while(dummy.next != null) {
			dummy = dummy.next;
			end = end.next;
		}
		int temp = begining.val;
		begining.val = end.val;
		end.val = temp;		
		return head;
	}
	
	public static ListNode swapNodes(ListNode head, int k) {
		int count = 0;
		ListNode begining = head;
		ListNode end = head;
		while(end != null) {
			count++;
			end = end.next;
		}
		end = head;
		
		for(int i = 1; i < k; i++) 
			begining = begining.next;
		for(int i = 1; i < count - k + 1; i++) 
			end = end.next;
		
		int temp = begining.val;
		begining.val = end.val;
		end.val = temp;
		
        return head;
    }
}
