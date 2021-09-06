package com.exxample.java;

import java.util.Stack;

public class IsSameTree {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3,null, null));
		TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
		System.out.println(isSameTreeRecursion(p, q));
		System.out.println(isSameTreeIteration(p, q));

	}
	
	public static boolean isSameTreeRecursion(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		if(p == null || q == null)
			return false;
		if(p.val != q.val) 
			return false;
		return isSameTreeRecursion(p.left, q.left) && isSameTreeRecursion(p.right, q.right);
	}
	
	public static boolean isSameTreeIteration(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		
		if(p == null || q == null)
			return false;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(p);
		stack.push(q);
		
		while(!stack.isEmpty()) {
			TreeNode tree1 = stack.pop();
			TreeNode tree2 = stack.pop();
			if(tree1 == null && tree2 == null )
				continue;
			
			if(tree1 == null || tree2 == null || tree1.val != tree2.val)
				return false;
			
			stack.push(tree1.left);
			stack.push(tree2.left);
			stack.push(tree1.right);
			stack.push(tree2.right);
		}
		return true;
	}
}
