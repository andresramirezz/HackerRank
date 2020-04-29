package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author andresr
 * Problem: Complete the function in the editor. If "a" and "b" are case-insensitive 
 * anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
 */
public class Anagrams {
	
	static boolean isAnagram( String a, String b ) {
		
		boolean ret = true;
		int l = a.length() ;
		int m = b.length();
		int start = 0;
		int start2 = 0;
		
		ArrayList<String> A = new ArrayList<>();
		ArrayList<String> B = new ArrayList<>();
		
		
		for (int i = 0; i < l; i++) {
			String s = a.substring(start, start+1);
			start++;
			A.add(s.toUpperCase());
		}
		Collections.sort(A);

		for (int i = 0; i < m; i++) {
			String t = b.substring(start2, start2+1);
			start2++;
			B.add(t.toUpperCase());
		}
		Collections.sort(B);
		
		if ( A.equals(B) ) {
			ret=true;
		}
		else {
			ret=false;
		}
		return ret;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		
		boolean ret = isAnagram(a,b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
}