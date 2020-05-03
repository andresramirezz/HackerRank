package com.hackerrank.strings;

import java.util.Scanner;

/**
 * @author andresr
 * Problem: a username is considered valid if all the following constraints are
 *  satisfied:
 *  The username consists of 8 to 30 characters inclusive. If the username 
 *  consists of less than 8 or greater than 30 characters, then it is an 
 *  invalid username. The username can only contain alphanumeric characters and 
 *  underscores (_). Alphanumeric characters describe the character set consisting
 *  of lowercase characters (a-z), uppercase characters (A-Z), and digits (0-9).
 *  The first character of the username must be an alphabetic character.
 */
public class ValidUsername {
	
	class UsernameValidator{
		public static final  String regularExpression = "^[A-ZA-z]\\w{7,29}$";
	}
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.nextLine());
		while ( n-- != 0 ) {
			String userName = scan.nextLine();
			
			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}