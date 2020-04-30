package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author andresr
 * Problem: Given a string, matching the regular expression [A-Za-z !,?._'@]+, split 
 * the string into tokens. We define a token to be one or more consecutive English 
 * alphabetic letters. Then, print the number of tokens, followed by each token on a 
 * new line.
 */

public class Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		
		int count = 0;
		String [] s2 = s.trim().split("[ !, ?._'@]+");
		ArrayList <String> s3 = new ArrayList<>(); 
		
		for (String string : s2) {
				s3.add(string);
				count = count + 1;
		}
		
		if( s == null || s.equals("") || s.trim().equals("") ) {
			System.out.println("0");
		}else {
			System.out.println(count);
		}

		for (String string : s3) {
			System.out.println(string);
		}
		
	}
}