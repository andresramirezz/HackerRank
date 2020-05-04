package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author andresr
 * Problem: Given a string of text in a tag-based language, parse this text and 
 * retrieve the contents enclosed within sequences of wellorganized tags meeting 
 * the following criterion:
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> 
 * is not valid, because the text starts with an h1 tag and ends with a non-matching
 * h2 tag. Tags can be nested, but content between nested tags is considered not 
 * valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but 
 * invalid is not valid. Tags can consist of any printable characters. 
 */
public class TagContentExtractor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while ( testCases-- > 0 ) {
			String line = in.nextLine();
			
			String regex = "<(.+)>([^<]+)</\\1>";
			boolean mf = false;
			Pattern p = Pattern.compile( regex );
			Matcher m = p.matcher(line);
			
			while ( m.find() ) {
				System.out.println( m.group(2));
				mf = true;
			} 
			if ( ! mf ){
				System.out.println("None");
			}
		}
		in.close();
	}
}