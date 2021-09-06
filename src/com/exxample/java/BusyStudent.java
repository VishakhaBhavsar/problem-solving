package com.exxample.java;

public class BusyStudent {

	public static void main(String[] args) {
		int[] startTime = {9,8,7,6,5,4,3,2,1};
		int[] endTime = {10,10,10,10,10,10,10,10,10}; 
		int queryTime = 5;
		System.out.println(busyStudent(startTime, endTime, queryTime));
	}
	 public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		 int count = 0;
		 for(int i = 0; i < startTime.length; i++){
			 if ((queryTime <= startTime[i] && queryTime >= endTime[i]) || (queryTime >= startTime[i] && queryTime <= endTime[i])) {
				 count++;
			 }
		 }
		 return count;
	 }
}