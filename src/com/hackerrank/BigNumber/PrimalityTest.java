package com.hackerrank.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author andresr
 * Problem: Given a large integer "n", use the Java BigInteger class' 
 * isProbablePrime method to determine and print whether it's prime or not prime.
 */
public class PrimalityTest {

	public static void main(String[] args) {
	      
		Scanner in = new Scanner(System.in);
	    BigInteger n = in.nextBigInteger();
	    in.close();
	    System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
	}
}
