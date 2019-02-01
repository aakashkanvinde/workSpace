Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.


Solution: 


package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//    static int digits[] = {};
//    static int digits[] = {1,2,3};
//    static int digits[] = {9,9,9};
    static int digits[] = {9, 9, 9, 9};

    public static void main(String[] args) {

        System.out.println(plusOne(digits));
    }


    static public String plusOne(int[] digits) {

        int[] solution = new int[digits.length];      // making a new array of same length as digits array
        int carry = 1;
        for (int index = digits.length - 1; index >= 0; index--) {    //parsing the array from last element
            int temp = digits[index] + carry;                         // add carry to the element i.e. 1 in the 1st iteration
            solution[index] = temp % 10;
            carry = temp / 10;    
        }

        if (carry == 1) {                                         // if carry is 1 increasing the size of solution array to include the new element
            solution = new int[digits.length + 1];
            solution[0] = 1;                                      // adding 1 as the first element 
        }

        return Arrays.toString(solution);
    }
}
