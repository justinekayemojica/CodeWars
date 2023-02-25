package KYU6_WhichAreIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * INSTRUCTIONS
 * 
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of 
 * the strings of a1 which are substrings of strings of a2.
 * 
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 * 
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * 
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: In some languages r must be without duplicates.
 * 
 */

public class WhichAreIn {

	public static void main(String[] args) {
		
		String[] a1 = {"cod", "code", "wars", "ewar", "pillow", "bed", "phht"};
		String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong", "codewars"};
		String ret[] = inArray(a1, a2);
		for(String ret1: ret) {
			System.out.println(ret1);
		}
	}
	
	public static String[] inArray(String[] array1, String[] array2) {
		System.out.println(Arrays.toString(array1) + " ; " + Arrays.toString(array2));
		String ret[] = {};
		List<String> retList = new ArrayList<String>();
		for (String a1 : array1) {
			for (String a2 : array2) {
				if(a2.contains(a1)) {
					if(retList.isEmpty() || !retList.contains(a1)) retList.add(a1);
				}
			}			
		}
		ret = retList.toArray(ret);
		Arrays.sort( ret, String.CASE_INSENSITIVE_ORDER);
		return ret;
	}
	
/* 
 * Codewars shortest code using arrays.stream
 * 
 
  public static String[] inArray(String[] array1, String[] array2) {
        return stream(array1).filter(s1 -> stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().distinct().toArray(String[]::new);
    }
 
 */
}

