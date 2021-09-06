package com.exxample.java;

public class AddBinary {

	public static void main(String[] args) {
		
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        if(a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        for(int i = b.length(); i < a.length(); i++){
            b += "0";
        }
        String result = "";
        boolean carry = false;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(carry){
                    result += "1";
                    carry = false;
                }else
                    result += "0";     
            } else if((a.charAt(i) == '0' && b.charAt(i) == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')){
                if(carry){
                    result += "0";
                    carry = true;
                }else
                    result += "1";    
            } else{
               if(carry){
                    result += "1";
                    carry = true;
                }else{
                    result += "0";
                   carry = true;
                }      
            }
        }
        if(carry) 
        	result += "1";
        result = reverse(result);
        return result;
            
    }
    
    public static String reverse(String a){
        String newS = "";
        for(int i = a.length()-1; i >= 0; i--){
            newS += a.charAt(i);
        }
        return newS;
    }
}
