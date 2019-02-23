package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr [] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        displayArray(arr);
    }

    public static void selectionSort(int [] nums){
        int length = nums.length;

        for(int i = 0; i < length - 1; i++){
            int min_element = i;

            for (int j = i + 1; j < length; j++){
                if(nums[j] < nums[min_element])
                    min_element = j;
            }

            int swap = nums[min_element];
            nums[min_element] = nums[i];
            nums[i] = swap;
        }
    }

    public static void displayArray(int [] nums){
        int length = nums.length;
        System.out.print("[");
        for(int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        System.out.println();
    }
}

// Time Complexity: O(n^2) as there are two nested loops.
