package kyu6_PairOfGloves;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 *  INSTRUCTION
 
 Winter is coming, you must prepare your ski holidays. The objective of this kata is to determine 
 the number of pair of gloves you can constitute from the gloves you have in your drawer.

Given an array describing the color of each glove, return the number of pairs you can constitute, 
assuming that only gloves of the same color can form pairs.
 
Examples: 

input = ["red", "green", "red", "blue", "blue"]
result = 2 (1 red pair + 1 blue pair)

input = ["red", "red", "red", "red", "red", "red"]
result = 3 (3 red pairs)
 
 * 
 */

public class PairOfGloves {
	
	public static void main(String[] args) {
		String[] gloves = {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"};
		System.out.println(numberOfPairs1(gloves));
		 
		
	}
	
	public static int numberOfPairs1(String[] gloves) {
	    return  (int) (gloves.length == 0 ?  0 : Arrays.asList(gloves).stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()))
				.values().stream().map(c -> c%2 != 0 && c>1 ? c-1 : c == 1 ? 0 : c).collect(Collectors.toList()).stream().reduce((x, y) -> x + y).get() / 2);
	  }
	
			
}
