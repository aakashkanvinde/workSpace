/*
Add Binary

Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sum = new StringBuilder();

        while (i >= 0 || j >= 0){
            if(i >= 0){
                carry += a.charAt(i) - '0';
                i--;
            }

            if (j >=0){
                carry += b.charAt(j) - '0';
                j--;
            }

            sum.append(carry % 2);
            carry = carry / 2;

        }

        if (carry==1){
            sum.append(1);
        }
        sum = sum.reverse();
        return sum.toString();
    }
}
