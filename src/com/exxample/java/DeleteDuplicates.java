package com.exxample.java;

public class DeleteDuplicates {

	public static void main(String[] args) {
		ListNode node = new ListNode(8);
		node = new ListNode(8, node); 
		node = new ListNode(5, node); 
		node = new ListNode(3, node); 
		node = new ListNode(1, node);
		
		printList(node);
		System.out.println(" ");
		node = deleteDuplicates(node);
		printList(node);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
            	temp = temp.next;
        }
        return head;
    }
}
