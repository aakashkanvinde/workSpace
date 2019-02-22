package com.example;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] numsArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int key = 23;
        int length = numsArray.length;

        int recursiveResult = recursiveBinarySearch(numsArray,0, length - 1, key);
        int iterativeResult = iterativeBinarySearch(numsArray, key);
        if(recursiveResult == -1)
//        if( iterativeResult == -1)
            System.out.println("Element is not present in the Array");
        else
            System.out.println("Element "+key+" found at index "+recursiveResult);
//            System.out.println("Element "+key+" found at index "+iterativeResult);
    }

    public static int recursiveBinarySearch(int nums[],int leftMost, int rightMost, int key){

        if(rightMost >= 1){
            int mid = leftMost + (rightMost - leftMost) / 2;

            // if the search key is present in the middle only
            if(nums[mid] == key){
                return mid;
            }

            // if the search key is greater than the mid element, only the second half(right half)
            // of the array is searched
            if(key > nums[mid]){
                return recursiveBinarySearch(nums,mid+1,rightMost,key);
            }

            // if the search key is smaller than the mid element, only the first half(left half)
            // of the array is searched
            if(key < nums[mid]){
                return recursiveBinarySearch(nums, leftMost,mid-1, key);
            }
        }

        // if the search key is not present in the Array, then return -1
        return -1;
    }

    public static int iterativeBinarySearch(int nums[], int key){
        int leftMost = 0, rightMost = nums.length - 1;
        while (leftMost <= rightMost){

            //calculate the middle of the array
            int mid = leftMost + (rightMost - leftMost) / 2;

            // if key is present in the middle only
            if(key == nums[mid]){
                return mid;
            }

            // if the search key is greater than the mid element, only the second half(right half)
            // of the array is searched
            if(key > nums[mid]){
                leftMost = mid + 1;
            }

            // if the search key is smaller than the mid element, only the first half(left half)
            // of the array is searched
            else {
                rightMost = mid - 1;
            }
        }

        // if the search key is not present in the Array, then return -1
        return -1;
    }
}

/*
Time complexity:

Best Case: O(1) - item is the middle of array. A constant number of comparisions are required

Worst Case: O(log n) - In the worst case, the item X does not exist in the array A at all.
                       Through each recursion or iteration of Binary Search, the size of the admissible range is halved.
                       This halving can be done ceiling(lg n ) times. Thus, ceiling(lg n ) comparisons are required.

*/
