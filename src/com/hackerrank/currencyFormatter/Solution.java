package com.hackerrank.currencyFormatter;

import java.text.NumberFormat;
import java.util.*;

/**
 * @author andresr
 * Problem: Given a double-precision number "payment", denoting an amount of 
 * money, use the NumberFormat class getCurrencyInstance method to convert
 * "payment" into the US, Indian, Chinese, and French currency formats.
 * 
 */

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: "+ us);
		System.out.println("India: "+ india);
		System.out.println("China: "+ china);
		System.out.println("France: "+ france);
	}
}