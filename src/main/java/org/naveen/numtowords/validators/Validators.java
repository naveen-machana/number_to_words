package org.naveen.numtowords.validators;

public class Validators {
	public boolean isValid(String inputText) {
		if (!isInteger(inputText)) {
			return false;
		}
		Integer input = Integer.parseInt(inputText);
		if (input <= 0) {
			return false;
		}
		
		if (input > 999_999_999) {
			return false;
		}
		
		return true;
	}
	
	private static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
