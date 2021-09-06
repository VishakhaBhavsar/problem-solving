package com.exxample.java;

import java.util.Stack;

public class MaxDepth {

	public static void main(String[] args) {
		TreeNode rootleft = new TreeNode(9, null, null);
		TreeNode rootright = new TreeNode(20, new TreeNode(15), new TreeNode(7));
		TreeNode root = new TreeNode(3,rootleft,rootright);
	
		System.out.println("Depth: " + maxDepthIteration(root));
		System.out.println("Depth: " + maxDepthrecursion(root));

	}
	public static int maxDepthrecursion(TreeNode root){	
		if(root == null)
			return 0;
		
		int left = maxDepthrecursion(root.left);
		int right = maxDepthrecursion(root.right);
		
		return Math.max(left, right) + 1;
	}
	
	public static int maxDepthIteration(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> depths = new Stack<>();
		
		if(root == null)
			return 0;
		
		stack.push(root);
		depths.push(1);
		
		int depth = 0; 
		int current_depth = 0;
		
		while(!stack.isEmpty()) {
			root = stack.pop();
			current_depth = depths.pop();
			
			if(root != null) {
				depth = Math.max(depth, current_depth);
				stack.push(root.left);
				stack.push(root.right);
				depths.push(current_depth + 1);
				depths.push(current_depth + 1);
			}
		}
		return depth;
	}
}
