package com.exxample.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoMovingAverage {

	public static void main(String[] args) {
		MovingAverage obj = new MovingAverage(3);	
		System.out.print(obj.next(1));
		System.out.print(" " + obj.next(10));
		System.out.print(" " + obj.next(3));
		System.out.println(" " + obj.next(5));	
		System.out.print(obj.nextOptimize(1));
		System.out.print(" " + obj.nextOptimize(10));
		System.out.print(" " + obj.nextOptimize(3));
		System.out.print(" " + obj.nextOptimize(5));	
	}
}

class MovingAverage {
	private int size;
	private List<Integer> list;
	private Queue<Integer> queue;
	private double sum;
	
    public MovingAverage(int size) {
    	this.size = size;
    	list = new ArrayList<>();
    	queue = new LinkedList<>();
    	sum = 0.0;
    }
    
    public double next(int val) {
    	int average = 0;
    	list.add(val);
    	for(int i = Math.max(0, list.size() - size); i < list.size(); i++) 
    		average += list.get(i);	
    	
    	return average * 1.0 / Math.min(size, list.size());
    }
    
    public double nextOptimize(int val) {
    	if(queue.size() == size) 
    		sum -= queue.remove();
    	
    	queue.add(val);
    	sum += val;
    	
    	return sum / queue.size();
    	
    }
}
