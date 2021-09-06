package com.exxample.java;
import java.util.HashMap;

public class LRUCacheMain {
	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); 
		lRUCache.put(2, 2); 
		System.out.println(lRUCache.get(1));   
		lRUCache.put(3, 3); 
		System.out.println(lRUCache.get(2));    
		lRUCache.put(4, 4); 
		System.out.println(lRUCache.get(1));    
		System.out.println(lRUCache.get(3));   
		System.out.println(lRUCache.get(4));  
	}
}

class LRUCache {
	private DoublyLinkedList list;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private int capacity;
	
    public LRUCache(int capacity) {
    	this.capacity = capacity; 
    	this.map = new HashMap<Integer, Node>();
    	list = new DoublyLinkedList();
    }
    
    public int get(int key) {
    	if(map.containsKey(key)) {
    		moveKeyToEndOfList(key);
    		return map.get(key).value;
    	}
    	return -1;
    }
    
    public void put(int key, int value) {
    	if(map.containsKey(key)) {
    		map.get(key).value = value;
    		moveKeyToEndOfList(key);
    	} else {
    		if(list.size() == capacity) 
    			map.remove(list.removeFirst());
    		Node n = new Node(key, value);
    		map.put(key, n);
    		list.add(n);
    	}
    }
    
    public void moveKeyToEndOfList(int key) {
    	Node n = map.get(key);
    	list.remove(n);
    	list.add(n);
    }
}

class Node{
	int key, value;
	Node prev, next;
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

class DoublyLinkedList{
	int cache_capacity;
	private Node head, tail;
	public DoublyLinkedList(){
		cache_capacity = 0;
	}
	
	public void add(Node n) {
		if(head == null) 
			head = tail = n;
		else {
			tail.next = n;
			n.prev = tail;
			tail = tail.next;
		}
		cache_capacity++;
	}
	
	public int removeFirst() {
		return remove(head);
	}
	
	public int remove(Node n) {
		if(n == head && n == tail) 
			head = tail = null;
		else if(n == head) {
			head = head.next;
			head.prev = null;
		} else if(n == tail) {
			tail = tail.prev;
			tail.next = null;
		} else {
			n.prev.next = n.next;
			n.next.prev = n.prev;
		}
		n.prev = n.next = null;
		cache_capacity--;
		return n.key;
	}
	 public int size() {
		 return cache_capacity;
	 }
}
