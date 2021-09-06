package com.exxample.java;

public class NthPrime {

	public static void main(String[] args) {
		System.out.println(nthPrime(190));

	}
	
	public static int nthPrime(int n) {
		int count = 0;
		int i;
		int num = 1;
		while(count < n) {
			num += 1;
			for(i = 2; i <= num; i++) {
				if(num % i == 0)
					break;
			}
			if(i == num)
				count++;
		}
		return num;
	}
}
