package com.exxample.java;

import java.util.Arrays;

public class MaximumUnits {

	public static void main(String[] args) {
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize = 10;
		System.out.println(maximumUnits(boxTypes, truckSize));
		
	}
	
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, ( a, b) -> -Integer.compare(a[1], b[1]));
        int maximumUnits = 0;
        for(int[] i: boxTypes){
        	int boxCount = Math.min(truckSize, i[0]);
        	maximumUnits += (boxCount * i[1]);
         	truckSize -= boxCount;
         	if(truckSize == 0)
         		break;       
        }
        return maximumUnits;
    }
}
