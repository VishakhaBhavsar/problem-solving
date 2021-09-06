package com.exxample.java;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class SubdomainVisits {

	public static void main(String[] args) {
		

	}
	
	public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str: cpdomains){
            String num = str.split(" ")[0];
            String s = str.split(" ")[1];
            map.put(s,Integer.parseInt(num));
            
            for(int i = 1; i < s.length; i++)
            	
                map.put(s.split("//."), map.getOrDefault(strs[i],0) + num);
            
        }
        System.out.println(map);
        
        List<String> list = new ArrayList<>();
        for(String key: map.keySet()) {
        	list.add(key)
        }
        return list;
    }
 }
