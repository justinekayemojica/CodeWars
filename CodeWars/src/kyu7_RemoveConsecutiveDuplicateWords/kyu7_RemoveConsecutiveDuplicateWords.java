package kyu7_RemoveConsecutiveDuplicateWords;


/*
 * INSTRUCTION
 
 Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. 
 For example:
 
 "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"

--> "alpha beta gamma delta alpha beta gamma delta"
 
 * 
 */

public class kyu7_RemoveConsecutiveDuplicateWords {

	public static void main(String[] args) {
		String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
		System.out.println(removeConsecutiveDuplicates(s));

	}
	
	public static String removeConsecutiveDuplicates(String s){
		   String[] strArr = s.split(" ");
		   String str = strArr[0];
		   for(int i = 1 ; i < strArr.length ; i ++) {
			   if(!strArr[i-1].equals(strArr[i])) {
				   str = str.concat(" " + strArr[i]);
			   } 
		   }
	       return str;
	    }

}
