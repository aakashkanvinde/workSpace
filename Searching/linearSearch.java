package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {2, 3, 4, 10, 40 };
        int x = 10;

        int result = linearSearch(nums,x);
        if(result == -1)
            System.out.println("Element not present in the Array");
        else
            System.out.println("Element "+x+" found at index "+result);
    }

    public static int linearSearch(int nums[], int x){
        for(int i = 0; i < nums.length; i++){
            if(x == nums[i])
                return i;
        }
        return -1;
    }
}

// Time complexity: O(n)
