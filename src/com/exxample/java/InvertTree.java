package com.exxample.java;

import java.util.Stack;

public class InvertTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
		preOrder(root);
		System.out.println("\n");
		preOrder(invertTreeRecursive(root));
		System.out.println("\n");
		preOrder(invertTreeIteration(root));
	}
	
	public static void preOrder(TreeNode root)
	{
	    if (root != null)
	    {
	    	System.out.print(" " + root.val);
	    	preOrder(root.left);
	    	preOrder(root.right);
	    }
	}
	
	public static TreeNode invertTreeRecursive(TreeNode root) {
		if(root == null || (root.left == null && root.right == null)) 
			return root;
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTreeRecursive(root.left);
		invertTreeRecursive(root.right);
		
		return root;
	}
	
	public static TreeNode invertTreeIteration(TreeNode root) {
		if(root == null)
			return root;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode current = stack.pop();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			
			if(current.left != null)
				stack.push(current.left);
			if(current.right != null)
				stack.push(current.right);
		}
		return root;
	}
}
