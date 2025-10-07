package com.spg.utils;

public class PalindromeCheck {
	
	public boolean isPalindrome(String str) {
		String strRev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			strRev = strRev.concat(String.valueOf(str.charAt(i)));
		}
		
		if(str.equalsIgnoreCase(strRev))
			return true;
		
		return false;
	}
}
