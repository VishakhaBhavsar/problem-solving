package com.exxample.java;

public class GetIntersectionNode {

	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(5);
		node1 = new ListNode(4, node1); 
		node1 = new ListNode(8, node1); 
		node1 = new ListNode(1, node1); 
		node1 = new ListNode(4, node1);
		
		ListNode node2 = new ListNode(5);
		node2 = new ListNode(4, node2); 
		node2 = new ListNode(8, node2); 
		node2 = new ListNode(1, node2); 
		node2 = new ListNode(6, node2);
		node2 = new ListNode(5, node2); 
		
		
		printList(node1);
		System.out.println("");
		printList(node2);
		System.out.println("");
		node1 = getIntersectionNode(node1, node2);
		printList(node1);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyA = headA, dummyB = headB;
        int lenA = 1, lenB = 1;
        while(dummyA != null || dummyB != null){
            lenA += dummyA == null ? 0 : 1;
            lenB += dummyB == null ? 0 : 1;
            dummyA = dummyA == null ? null : dummyA.next;
            dummyB = dummyB == null ? null : dummyB.next;
        }
        if(lenA > lenB) {
        	int diff = lenA - lenB;
        	while(diff-- > 0) 
        		headA = headA.next;
        } else if(lenA < lenB) {
        	int diff = lenB - lenA;
        	while(diff-- > 0) 
        		headB = headB.next;
        }
        while(headA != null || headB != null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }	
}
