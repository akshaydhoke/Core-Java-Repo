package com.gfg.string.easy;

public class BackspaceStringCompare {

	static boolean backspaceCompare(String s, String t) {
		return getActual(s).equals(getActual(t));
	}

	private static String getActual(String input) {

		StringBuilder actualString = new StringBuilder();
		int hashCount = 0;

		for (int i = input.length() - 1; i >= 0; i--) {

			// Keep a count of backspace characters
			if (input.charAt(i) == '#') {
				hashCount++;
				continue;
			}

			// If backspace count > 0 reduce it and skip the character
			if (hashCount > 0) {
				hashCount--;
			} else {
				// If no backspace, just insert at beginning
				actualString.insert(0, input.charAt(i));
			}
		}

		return actualString.toString();
	}

	public static void main(String[] args) {

//		String s = "ab##";
//		String t = "c#d#";

	    String s = "aav######";
	    String t = "aav#####";

		System.out.println(backspaceCompare(s, t));

	}

}
