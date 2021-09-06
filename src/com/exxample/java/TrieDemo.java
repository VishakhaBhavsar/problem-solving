package com.exxample.java;

public class TrieDemo {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		System.out.println(trie.search("apple")); 
		System.out.println(trie.search("app"));     
		System.out.println(trie.startsWith("app")); 
		trie.insert("app");
		System.out.println(trie.search("app"));
	}
}

 class Trie{
	TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode node = root;
		for(int i = 0; i < word.length(); i++) {
			if(node.children[word.charAt(i) - 'a'] == null) 
				node.children[word.charAt(i) - 'a'] = new TrieNode();
			node = node.children[word.charAt(i) - 'a'];
		}
		node.isEnd = true;
	}
	
	public boolean search(String word) {
		TrieNode node = root;
		for(int i = 0; i < word.length(); i++) {
			if(node.children[word.charAt(i) - 'a'] == null)
				return false;
			node = node.children[word.charAt(i) - 'a'];
		}
		return node.isEnd;
	}
	
	public boolean startsWith(String prefix) {
		TrieNode node = root;
		for(int i = 0; i < prefix.length(); i++) {
			if(node.children[prefix.charAt(i) - 'a'] == null)
				return false;
			node = node.children[prefix.charAt(i) - 'a'];
		}
		return true;
	}
}
