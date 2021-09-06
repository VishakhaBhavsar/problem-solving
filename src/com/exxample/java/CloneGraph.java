package com.exxample.java;

import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {
		GraphNode node1 = new GraphNode();
		GraphNode node2 = new GraphNode();
		GraphNode node3 = new GraphNode();
		GraphNode node4 = new GraphNode();
		
		node1.val = 1;
		node2.val = 2;
		node3.val = 3;
		node4.val = 4;
	
		node1.neighbors.add(node4);
		node1.neighbors.add(node2);
		
		node2.neighbors.add(node1);
		node2.neighbors.add(node3);
		
		node3.neighbors.add(node2);
		node3.neighbors.add(node4);
		
		node4.neighbors.add(node1);
		node4.neighbors.add(node3);
		
		GraphNode node = cloneGraph(node1);
		System.out.println(node.val);
		System.out.println(node.neighbors.get(0).val + node.neighbors.get(1).val);
	}
	
	public static GraphNode cloneGraph(GraphNode node) {
		if(node == null)
			return node;
		
		Map<GraphNode, GraphNode> map = new HashMap<>();
		Queue<GraphNode> queue = new ArrayDeque<>();
		
		queue.add(node);
		map.put(node, new GraphNode(node.val, new ArrayList<>()));
		while(!queue.isEmpty()) {
			GraphNode h = queue.poll();
			
			for(GraphNode neighbour: h.neighbors) {
				if(!map.containsKey(neighbour)) {
					map.put(neighbour, new GraphNode(neighbour.val, new ArrayList<>()));
					queue.add(neighbour);
				}
				map.get(h).neighbors.add(map.get(neighbour));
			}
		}
		return map.get(node);
	}
}
