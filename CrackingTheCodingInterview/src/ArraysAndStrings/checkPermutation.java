package ArraysAndStrings;

/*

Question 1.2 Check Permutation:
Given two strings, write a method to decide if one is a permutation of the other

 */

import java.util.HashMap;
import java.util.Map;

public class checkPermutation {
    public static void main(String[] args) {
        String s = "cata";
        String t = "taca";
        if (checkPermutation(s, t))
            System.out.println("Strings are permutation of each other");
        else
            System.out.println("Strings are not permutation of each other");
    }

    private static boolean checkPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, (map.get(c) - 1));
            } else {
                return false;
            }
        }

        return true;
    }
}

/*
Output:
Strings are permutation of each other


 */