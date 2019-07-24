package ArraysAndStrings;

/*

Question 1.1 isUnique:
Implement an algorithm to determine if a string has all unique characters. What if you cannot use any additional data structures?

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class isUnique {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "abcda";
        boolean answer = isUnique(s);
//        answer = isUnique(s1);
//        answer = isUnique2(s);
//        answer = isUnique2(s1);
//        answer = isUnique3(s);
//        answer = isUnique3(s1);
//        answer = isUnique4(s);
//        answer = isUnique4(s1);
        if (answer) {
            System.out.println("String '" + s + "' is unique");
        } else {
            System.out.println("String '" + s + "' contains duplicates");
        }
    }

    // Approach 1: Brute force : Time: O(n^2), Space: O(1)
    private static boolean isUnique(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Approach 2: Using sorting of ascii values : Time: O(n.logn) , Space: O(1)
    private static boolean isUnique2(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Approach 3: Using extra Data structure : Time: O(n), Space: O(n)
    private static boolean isUnique3(String s) {
        Set<Character> set = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else
                return false;
        }
        return true;
    }

    // Approach 4: Using extra Data structure : Time: O(n), Space: O(n)
    private static boolean isUnique4(String s) {
        boolean ch[] = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if (ch[value]) {
                return false;
            }
            ch[value] = true;
        }
        return true;
    }
}

/*
Output:
String 'abcd' is unique
String 'abcda' contains duplicates

 */