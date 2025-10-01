package main.java;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A run is a series of adjacent chars that are the same.
	 * @return max run length
	 */
    public static int maxRun(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int maxRun = 1;
        int currentRun = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentRun++;
            } else {
                currentRun = 1;
            }
            maxRun = Math.max(maxRun, currentRun);
        }
        return maxRun;
    }



    /**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
    public static String blowup(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) && i < str.length() - 1) {
                int repeat = c - '0';
                char nextChar = str.charAt(i + 1);
                for (int j = 0; j < repeat; j++) {
                    sb.append(nextChar);
                }
            } else if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
    public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0) return false;
        if (len > a.length() || len > b.length()) return false;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            String sub = a.substring(i, i + len);
            set.add(sub);
        }
        for (int i = 0; i <= b.length() - len; i++) {
            String sub = b.substring(i, i + len);
            if (set.contains(sub)) {
                return true;
            }
        }
        return false;
    }
}