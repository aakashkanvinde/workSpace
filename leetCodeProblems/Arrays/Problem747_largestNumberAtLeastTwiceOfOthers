package com.example;

/* Question 747 : Largest Number at least twice of others

In a given integer array nums, there is always exactly one largest element.
Find whether the largest element in the array is at least twice as much as every other number in the array.
If it is, return the index of the largest element, otherwise return -1.

Example 1:
Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.

Example 2:
Input: nums = [1, 2, 3, 4]
Output: -1
Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.

Note:

nums will have a length in the range [1, 50].
Every nums[i] will be an integer in the range [0, 99].
*/



//      SOLUTION:


public class Main {

    //DIFFERENT TEST CASES

//    static int [] nums = {0,0,0,1};
//    static int [] nums = {3,6,1,0};
//    static int [] nums = {0,0,0,1};
    static int [] nums = {1,0};
//      static int [] nums = {0,0,2,3};


    public static void main(String[] args) {
	// write your code here

        System.out.println(dominantIndex(nums));

    }

    public static int dominantIndex(int[] nums) {
        int index = 0;
        int maxIndex = 0;
        int max = nums[index];


        if (nums.length < 2){               //checking if array empty or size 1: return 0th position
            return 0;
        }

        for (index = 0; index < nums.length; index++){          //check through the array for max number & its index
            if(nums[index] > max){
                max = nums[index];
                maxIndex = index;
            }
        }

        for (index = 0; index < nums.length; index++) {         //check if other elements are twice as much as the max element
            if ( index!= maxIndex && (nums[index] * 2) > max) {
                maxIndex = -1;                                  // if not return -1
            }
        }

        return maxIndex;                                        // return the maxIndex or the position of max element in the array
    }
}
