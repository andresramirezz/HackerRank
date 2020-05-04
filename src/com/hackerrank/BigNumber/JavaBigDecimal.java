package com.hackerrank.BigNumber;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 * @author andresr
 * Problem: Given an array s of n real number strings, sort them in descending order
 * Each number must be printed in the exact same format as it was read from stdin, 
 * meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers 
 * represent numerically equivalent values, then they must be listed in the same 
 * order as they were received as input). 
 */
public class JavaBigDecimal {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String [] s = new String [ n + 2 ];
		
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		
		for(int i=0; i<n-1; i++)
		{
		    for(int j=0; j<n-1-i; j++)
		    {
		        BigDecimal d1=new BigDecimal(s[j]);
		         BigDecimal d2=new BigDecimal(s[j+1]);
		        if(d1.compareTo(d2)<0)
		        {
		            String temp=s[j];
		            s[j]=s[j+1];
		            s[j+1]=temp;
		        }
		    }
		}		
		//Output
		for (int i = 0; i < n; i++) {
			System.out.println( s[i]);
		}
	}

}
