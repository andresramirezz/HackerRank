package com.hackerrank.strings;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author andresr
 * Problem: Given a string "s" and an integer "k", complete the function so that it 
 * finds the lexicographically smallest and largest substrings of length "k".
 */
public class SubstringComparisons {
	
	public static String getSmallestAndLargest (String s, int k) {
		
		TreeSet<String>  list = new TreeSet<String>();

		int start = 0;
		for (int i = k; i <= s.length(); i++) {
			String comb = s.substring(start, k);
			start++;
			k++;
			list.add(comb);
		}

		String smallest = list.first();
		String largest = list.last();
		
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		
		System.out.println(getSmallestAndLargest(s, k));

	}

}
