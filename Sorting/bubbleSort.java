package com.example;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        int arr [] = {64, 34, 100, 24, 81, 1, 90};
        bubbleSort(arr);
        System.out.println("Sorted Array: ");
        displayArray(arr);
    }

    public static void bubbleSort(int [] nums){
        int length = nums.length;

        for(int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    // swap arr[j] and arr[j+1]
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
        }
    }

    // Prints the whole array
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
