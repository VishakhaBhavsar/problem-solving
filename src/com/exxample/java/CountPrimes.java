package com.exxample.java;

public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimes(100000));

	}
	
	public static int countPrimes(int n) {
		boolean[] primes = new boolean[n];
		
		for(int i = 2; i * i < n; i++) {
			if(!primes[i]) {
				for(int j = i; j * i < n; j++)
					primes[i * j] = true;
			}
		}
		
		int countPrime = 0;
		
		for(int i = 2; i < n; i++) {
			if(!primes[i])
				countPrime++;
		}
			
		return countPrime;
	}

}
