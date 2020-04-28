package com.hackerrank.Strings;

import java.util.*;

/**
 * @author andresr
 * Problem: Given two strings of lowercase English letters A and B perform the following 
 * operations: Sum the lengths of A and B. Determine if A is lexicographically larger than B 
 * (i.e.: does B come before A in the dictionary?). Capitalize the first letter in A and B 
 * and print them on a single line, separated by a space.
 */
public class Solutions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();

		System.out.println( A.length()+B.length() );
		if ( A.compareTo(B) > 0 ) {
			System.out.println( "Yes" );
		}else {
			System.out.println( "No" );
		}
		System.out.println( A.substring(0, 1).toUpperCase()+A.substring(1)+" "+ B.substring(0, 1).toUpperCase()+B.substring(1)  );

	}

}
