package com.string;

public class StringPalindromeExp {

	public static void main(String[] args) {

		String original = "121";
		boolean flag = checkPalindromString(original);
		if (flag == true) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String Is Not palindrome");
		}

	}

	private static boolean checkPalindromString(String original) {
		String revStr = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			revStr = revStr + original.charAt(i);
		}
		if (original.equals(revStr)) {
			return true;
		}
		return false;
	}

}
