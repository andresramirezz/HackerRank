/**
 * 
 */
package com.hackerrank.StaticInitializerBlock;

import java.util.Scanner;

/**
 * @author Andres Ramirez
 * File: Solution.java
 * Problem: Complete the given code so that it outputs the area of a parallelogram 
 * with breadth B and height H. You should read the variables from the standard input.
 * If B or H <= 0, the output should be "java.lang.Exception: Breadth and height must be
 * positive" without quotes.
 *
 */
public class Solution {

	static boolean flag = true; 
	static int B;
	static int H;
	
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height "
								+ "must be positive");
		}
		sc.close();
		System.out.println(B +" "+ H);
	}
	
	public static void main(String[] args) {
		
		if(flag) {
			int area = B * H;
			System.out.println( area );
		}

	}

}
