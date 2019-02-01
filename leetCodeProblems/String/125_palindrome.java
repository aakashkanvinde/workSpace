/*

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

*/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
