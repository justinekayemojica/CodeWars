package kyu7_BuildASquare;

/*
 * INSTRUCTION
 
 I will give you an integer. Give me back a shape that is as long and wide as the integer. 
 The integer will be a whole number between 1 and 50.
 
 I will give you an integer. Give me back a shape that is as long and wide as the integer. 
 The integer will be a whole number between 1 and 50.
 
 +++
 +++
 +++
 
 * 
 */

public class BuildASquare {
	public static void main(String[] args) {
		System.out.println(generateShape(50));
		System.out.println();
		
	}
	
	public static final String generateShape1(int n) {
		String str = "";
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				str += "+";
			}
			str+= "\n";
		}
        return str;
    }
	
	public static final String generateShape(int n) {
        return ("+".repeat(n) + "\n").repeat(n).trim();
    }

}
