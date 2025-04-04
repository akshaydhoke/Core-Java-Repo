package com.gfg.string.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sherlock_Valid_String {

	public static String isValid(String s) {

		Map<Character, Integer> charFreqMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int freq = charFreqMap.getOrDefault(c, 0);
			charFreqMap.put(c, ++freq);
		}

		System.out.println(charFreqMap);

		int[] arr = new int[charFreqMap.size()];
		int idx = 0;
		for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet()) {
			arr[idx++] = characterIntegerEntry.getValue();
		}
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		if (charFreqMap.size() == 1)
			return "YES";

		int first = arr[0];
		int second = arr[1];
		int secondLast = arr[arr.length - 2];
		int last = arr[arr.length - 1];

		// If first and last are same, then all frequencies are same
		if (first == last)
			return "YES";

		// If first is 1, and all other characters have 1 frequency
		if (first == 1 && second == last)
			return "YES";

		// If all are same and last character has just 1 extra count
		if (first == second && second == secondLast && secondLast == (last - 1))
			return "YES";

		// Else invalid string
		return "NO";
	}

	public static void main(String[] args) {

//		String s = "ABCDEEDCBAE";  // YES
		String s = "aabbcd"; // NO

		System.out.println(isValid(s));

	}
}
