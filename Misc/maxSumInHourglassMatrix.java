/*
Function Description
Given a 6x6 2D Array, arr: We define an hourglass in A to be a subset of values with indices falling in this pattern in arr's
graphical representation: 

a b c
  d
e f g

There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. 
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. 
Complete the function hourglassSum. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers
Input Format

Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j].

Constraints:
-9 <= arr[i][j] <= 9
0 <= i,j <= 5

Output Format
Print the largest (maximum) hourglass sum found in arr.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
19

*/


// Solution:

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    int row = 6;
    int column = 6;
    int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i <= row-3; i++){
        for (int j = 0; j<= column-3; j++){
            int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        
        max_sum = Math.max(sum,max_sum);
        }
    }
    return max_sum;
}
