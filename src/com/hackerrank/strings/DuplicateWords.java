package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author andresr
 * Problem: In this challenge, we use regular expressions (RegEx) to remove 
 * instances of words that are repeated more than once, but retain the first 
 * occurrence of any case-insensitive repeated word. 
 */
public class DuplicateWords {

	public static void main(String[] args) {
		
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		Scanner in = new Scanner (System.in);
		int numSentences = Integer.parseInt(in.nextLine());
		
		while ( numSentences-- > 0) {
			String input = in.nextLine();
			
			Matcher m = p.matcher(input);
			
			while ( m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}
			System.out.println( input );
		}
		in.close();
	}

}
