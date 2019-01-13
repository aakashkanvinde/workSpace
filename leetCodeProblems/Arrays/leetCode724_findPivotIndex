package com.example;

/*
724. Find Pivot Index

Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.


Example 1:
Input:
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation:
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.

Example 2:
Input:
nums = [1, 2, 3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.

Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].

*/

public class Main {

    static int [] nums = {1, 7, 3, 6, 5, 6};
//    static int [] nums = {};
    public static void main(String[] args) {
	// write your code here

        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum, sum;
        int index1, index2, pivot = 0;

        if (nums.length == 0) {
            return -1;
        }
//Time Complexity of the below code is O(N^2):

/*
        //traverse through each element of nums array
        for(index1 = 0; index1 < nums.length ; ++index1){

            leftSum = 0;

            //calculate the leftSum for index2
            for(index2 = 0; index2 < index1; index2++){
                leftSum = leftSum + nums[index2];
            }

            rightSum=0;

            //calculate rightsum for index2
            for(index2 = index1 + 1; index2 < nums.length; index2++){
                rightSum = rightSum + nums[index2];
            }

            //leftsum = rightSum, you have your pivot index
            if(leftSum == rightSum){
                pivot = index1;
                break;
            }else{
                pivot = -1;                 // if no pivot index found return -1
//                break;
            }
        }
        return pivot;
*/


// Optimized solution : Time Complexity O(N):

        sum = 0;

        //will calculate the Total sum of all elements of the nums array for index1
        for (index1 = 0; index1 < nums.length;index1++){
            sum += nums[index1];
        }


        pivot = -1;         // if no pivot found return -1


        for (index1 = 0; index1 < nums.length ; index1++){
            sum -= nums[index1];                // will calculate the right sum of all remaining elements of the nums array for index1

            if (leftSum == sum){                //if leftsum = rightsum pivot will be the current index
                pivot = index1;
            }

            leftSum += nums[index1];
        }

     return pivot;
    }
}
