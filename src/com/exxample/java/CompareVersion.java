package com.exxample.java;

public class CompareVersion {

	public static void main(String[] args) {
		System.out.println(compareVersion("7.5.2.4", "7.5.3"));

	}
	
	public static int compareVersion(String version1, String version2) {
		String[] v1S = version1.split("\\.");
		String[] v2S = version2.split("\\.");
		
		for(int i = 0; i < Math.max(v1S.length, v2S.length); i++) {
			int v1 = i < v1S.length ? Integer.parseInt(v1S[i]) : 0;
			int v2 = i < v2S.length ? Integer.parseInt(v2S[i]) : 0;
			
			if(v1 != v2) 
				return v1 > v2 ? 1 : -1; 
		}
		return 0;
	}
	public static Pair<Integer, Integer> getNextChunk(String version, int p){
		if(p > version.length())
			return new Pair(0, p);
		
		int pEnd = p;
		int i;
		while(pEnd < version.length() && version.charAt(pEnd) != '.') {
			++pEnd;
		}
		if(pEnd != version.length() - 1) {
			i = Integer.parseInt(version.substring(p, pEnd));
		} else {
			i = Integer.parseInt(version.substring(p, version.length()));
		}
		
		p = pEnd + 1;
		return new Pair(i , p);
	}
	
	public static int compareVersionTwoPointerApproach(String version1, String version2) {
		
		int v1End = 0;
		int v2End = 0;
		int v1, v2;
		Pair<Integer, Integer> pair;
		while(v1End < version1.length() || v2End < version2.length()) {
			pair = getNextChunk(version1, v1End);
			v1 = pair.getKey();
			v1End = pair.getValue();
			
			pair = getNextChunk(version2, v2End);
			v2 = pair.getKey();
			v2End = pair.getValue();
			
			if(v1 != v2)
				return v1 > v2 ? 1: -1;
		}
		return 0;
	}
}
