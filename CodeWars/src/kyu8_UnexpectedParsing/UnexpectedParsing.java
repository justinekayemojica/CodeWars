package kyu8_UnexpectedParsing;

import java.util.HashMap;

/*
 * INSTRUCTION
 *
 Expected Behaviour
 Function should return a dictionary/Object/Hash with "status" as a key, 
 whose value can : "busy" or "available" depending on the truth value of 
 the argument is_busy.

 But as you will see after clicking RUN or ATTEMPT this code has several bugs, 
 please fix them.
 *
 */

public class UnexpectedParsing {

	public static void main(String[] args) {
		System.out.println(getStatus(true));
		System.out.println(getStatus(false));

	}
	
	public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
        	status.put("status", "busy");
        } else {
        	status.put("status", "available");
        }
        return status;
    }

}
