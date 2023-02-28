package kyu8_CountingSheep;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * INSTRUCTION
 
  Consider an array/list of sheep where some sheep may be missing from their place. 
  We need a function that counts the number of sheep present in the array (true means present).
  
  Example
  
  [true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
  
  The correct answer would be 17.
  
  Hint: Don't forget to check for bad values like null/undefined
 
 * 
 */

public class Counter {
	public static void main(String[] args) {
		Boolean[] arrayOfSheeps = {null ,true};
		
		System.out.println(
				countSheeps(arrayOfSheeps)
				);
		
	}

	public static int countSheeps(Boolean[] arrayOfSheeps) {
	    return (int) (arrayOfSheeps.length == 0  ? 0 : 
			Arrays.asList(arrayOfSheeps).stream().filter(Objects::nonNull).filter(s -> s == true).collect(Collectors.toList()).stream().count());
	  }
}
