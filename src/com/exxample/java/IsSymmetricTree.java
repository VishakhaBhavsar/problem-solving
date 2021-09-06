package com.exxample.java;
import java.util.Stack;

public class IsSymmetricTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, new TreeNode(3), null));
		System.out.println(isSymmetricIteration(root));
		System.out.println(isSymmetricRecursion(root));
	}
	
	public static boolean isSymmetricIteration(TreeNode root) {
		if(root == null || (root.left == null && root.right == null))
			return true;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root.left);
		stack.push(root.right);
		
		while(!stack.isEmpty()) {
			TreeNode right = stack.pop();
			TreeNode left = stack.pop();
			if(right == null && left == null)
				continue;
			if(right == null || left == null)
				return false;
			if(right.val != left.val)
				return false;
			
			stack.push(left.left);
			stack.push(right.right);
			stack.push(left.right);
			stack.push(right.left);
		}
		return true;
	}
	
	public static boolean isSymmetricRecursion(TreeNode root) {
		return isMirror(root, root);
	}
	
	public static boolean isMirror(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null)
			return true;
		if(t1 == null || t2 == null)
			return false;
		return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}
}
