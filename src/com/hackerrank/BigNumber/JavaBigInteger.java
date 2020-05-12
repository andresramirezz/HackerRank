package com.hackerrank.BigNumber;

import java.math.BigInteger;
import java.util.*;

/**
 * @author andresr
 * Problem: you have to add and multiply huge numbers! These numbers are so 
 * big that you can't contain them in any ordinary data types like a long integer.
 */

public class JavaBigInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		
		scan.close();
		
		BigInteger add, multiply;
		add = a.add(b);
		multiply = a.multiply(b);
		
		System.out.println( add );
		System.out.println( multiply );
	}
}