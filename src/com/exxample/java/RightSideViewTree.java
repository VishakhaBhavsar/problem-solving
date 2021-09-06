package com.exxample.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
		System.out.println(rightSideView(root));
	}
	
	public static List<Integer> rightSideView(TreeNode root){
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			list.add(queue.peek().val);
			
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if(node.right != null) 
					queue.add(node.right);
				if(node.left != null)
					queue.add(node.left);
			}
		}
		
		return list;
		
	}
}
