/*
69. Sqrt(x): Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since
             the decimal part is truncated, 2 is returned.
*/

class Solution {
    public int mySqrt(int x) {
          long i = 1, result = 1;   //taking long because int value overflows in some extreme cases
            // Base Cases           //like if we have to get a square root of 2147395600 we get a wrong answer with int
            if (x == 0 || x == 1)
                return x;
            while (result <= x){
            i++;
            result = i * i;
        }
        return (int)(i - 1);      //typecasting to an int value to truncate the digits and return only the integer part
    }
}
