/**
 * 
 */
package com.hackerrank.DateAndTime;
import java.util.Calendar;
import java.util.Locale;


/**
 * @author Andres Ramirez
 * Problem: You are given a date. You just need to write the method, 
 * which returns the day on that date  
 *
 */

class Result {
/*
 * Complete the 'findDay' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER month
 *  2. INTEGER day
 *  3. INTEGER year
 */

    public static String findDay ( int month, int day, int year ) {
    	
    	Calendar c = Calendar.getInstance();
    	c.set(year, month-1, day);
    	String d = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.US).toUpperCase();
		
    	return d;
		
    }	
}