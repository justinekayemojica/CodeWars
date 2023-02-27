package kyu6_DoesMyNumberLookBigInthis;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * INSTRUCTION
 
 A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, 
 each raised to the power of the number of digits in a given base. In this Kata, we will restrict 
 ourselves to decimal (base 10).
 
 A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, 
 each raised to the power of the number of digits in a given base. In this Kata, we will restrict 
 ourselves to decimal (base 10).
 
 and 1652 (4 digits), which isn't:
 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 
 and 1652 (4 digits), which isn't:
 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
 
 The Challenge:

 Your code must return true or false (not 'true' and 'false') depending upon whether the given number 
 is a Narcissistic number in base 10.
 This may be True and False in your language, e.g. PHP.
 Error checking for text strings or other invalid inputs is not required, only valid positive non-zero
 integers will be passed into the function.
 
 * 
 */

public class DoesMyNumberLookBigInthis {
	public static void main(String[] args) {
		int number = 1938;
		System.out.println(isNarcissistic(number) ? number + " is narcissistic" : number + " is not narcissistic" );
	}
	
	public static boolean isNarcissistic(int number) {
        return Arrays.asList(String.valueOf(number).split("")).stream().map(Integer::valueOf)
        		.map(n -> Math.pow(Double.valueOf(n), Double.valueOf(String.valueOf(number).length())))
				.reduce((x,y) -> x + y).get().intValue() == number;
    }

}
