package com.hackerrank.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author andresr
 * Problem: You are given "n" lines. In each line there are zero or more integers. 
 * You need to answer a few queries where you need to tell the number located in "y"
 * position of "x" line.
 */

public class JavaArraylist {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d,q,x,y;
		
		ArrayList[] newArray = new ArrayList[n];
		
		for ( int i = 0; i < n; i++ ) {
			d = scan.nextInt();
			newArray[i] = new ArrayList<Object>();
			
			for ( int j = 0; j < d; j++ ) {
				newArray[i].add(scan.nextInt());
			}
		}
		q = scan.nextInt();
		for ( int i = 0; i < q; i++ ) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			try {
				System.out.println( newArray[x-1].get(y-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
			
		}
		scan.close();
	}
}