/*
Question 189. Given an array, rotate the array to the right by k steps, where k is non-negative.

Eg:
        Input: [1,2,3,4,5,6,7] and k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]

Note:

Try to come up as many solutions as you can. Could you do it in-place with O(1) extra space?
*/

public class Solution {
    public String rotate(int[] nums, int k) {
        //Solution 1: BRUTE FORCE
        int length = nums.length;
        int temp, prev;
        for(int i = 0; i < k; i++){
            prev = nums[length - 1];
            for (int j = 0 ;j<length; j++){
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        } 
        // Time Complexity: O(n*k)     Space Complexity: O(1)
    return java.util.Arrays.toString(nums);
    }
}

/*
Recommended Solution

public class Solution {
    public String rotate(int[] nums, int k) {
        //Solution 2: Using an extra array
        int []copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            copy[(i+k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            nums[i] = copy[i];
        }
        // Time complexity : O(n)       Space complexity : O(n)
    return java.util.Arrays.toString(nums);
    }
}
*/
