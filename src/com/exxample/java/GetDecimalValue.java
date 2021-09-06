package com.exxample.java;

public class GetDecimalValue {

	public static void main(String[] args) {
		ListNode node = new ListNode(0);
		node = new ListNode(0, node); 
		node = new ListNode(0, node); 
		node = new ListNode(0, node); 
		node = new ListNode(0, node);
		node = new ListNode(0, node); 
		node = new ListNode(1, node); 
		node = new ListNode(1, node); 
		node = new ListNode(1, node);
		node = new ListNode(0, node); 
		node = new ListNode(0, node);
		node = new ListNode(1, node); 
		node = new ListNode(0, node); 
		node = new ListNode(0, node); 
		node = new ListNode(1, node);
		printList(node);
		System.out.println("");
		System.out.println(getDecimalValueOptimalWay(node));
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(" " + head.val);
			head = head.next;
		}
	}
	
	public static int getDecimalValueOptimalWay(ListNode head) {
		int num = 0;
		while(head != null) {
			num = num * 2 + head.val;
			head = head.next;
		}
		return num;
	}
	
	public static int getDecimalValue(ListNode head) {
		ListNode temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}

		int num[] = new int[count];
        temp = head;
        count = 0;
        while(temp != null){
        	num[count++] = temp.val;
        	temp = temp.next;
        }
        StringBuilder s = new StringBuilder(); 
        for(int n : num) 
        	s.append(n);
        
        int n = Integer.parseInt(s.toString(), 2);
        return n;
    }
}
