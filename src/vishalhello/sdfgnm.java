package vishalhello;

import java.util.*;

public class sdfgnm {

	public  String palinCheck(String str) {
		// TODO Auto-generated method stub

	
		String final_str = str;
		if(isPalindrome(str)) {
			final_str+=" is palindrome";
			if(getEvenLetterSum(str)>25) {
				final_str+= " and the sum of even numbers is greater than 25";
			} else {
				final_str+= " and sum of even numbers is less than 25";
			}
		} else {
			final_str+=" is not palindrome";
		}
		return final_str;
	}
	
	public boolean isPalindrome(String str) {
		int len = str.length();
		boolean is_palindrome = true;
		int sum = 0;
		for(int i=0; i< len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				is_palindrome = false;
				break;
			}
		}
		return is_palindrome;
	}
	
	public int getEvenLetterSum(String str) {
		int len = str.length();
		int sum = 0;
		for(int i=0; i< len;i++) {
			int x = Integer.parseInt(String.valueOf(str.charAt(i)));
			if(x%2 == 0) {
				sum+=x;
			}
		}
		return sum;
	}
}
