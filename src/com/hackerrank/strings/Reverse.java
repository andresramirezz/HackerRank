package com.hackerrank.strings;

import java.util.*;


/**
 * @author andresr
 * Problem: Given a string "A", print Yes if it is a palindrome, print No otherwise.
 */
public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String A = sc.next();
		sc.close();
		int l = A.length();
		int start = l;
		int start2 = 0;
		ArrayList<String> B = new ArrayList<>();
		ArrayList<String> C = new ArrayList<>();
		
		
		for (int i = 0; i < l; i++) {
			String s = A.substring(start-1, start);
			start--;
			B.add(s);
		}

		for (int i = 0; i < l; i++) {
			String t = A.substring(start2, start2+1);
			start2++;
			C.add(t);
		}

		if ( B.equals(C) ) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}