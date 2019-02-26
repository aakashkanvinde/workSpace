public class MergeSort {

    public static void main(String[] args) {
        int arr [] = {64, 25, 12, 22, 11, 14, 54, 120, 72, 89};
        mergeSort(arr);
        System.out.println("Sorted Array: ");
        displayArray(arr);

    }

    public static void mergeSort(int[] nums){
        mergeSort(nums, new int[nums.length], 0, nums.length - 1);
    }

    public static void mergeSort(int [] nums, int [] temp, int leftStart, int rightEnd){

        // if there is only one or less than one element in the given array
        if(leftStart >= rightEnd){
            return;
        }
        
        int middle = (rightEnd + leftStart) / 2;                     // middle of the array
        mergeSort(nums, temp, leftStart, middle);                    // recursive call to the left side of the array
        mergeSort(nums, temp, middle + 1, rightEnd);        // recursive call to the right side of the array
        merge(nums, temp, leftStart, rightEnd);                     // merging sorted left halves and right halves
    }

    public static void merge(int[] nums, int [] temp, int leftStart, int rightEnd){
        
        int leftEnd = (rightEnd + leftStart) / 2;                  // end of the left side of array
        int rightStart = leftEnd + 1;                              // start of the right side of array
        int size = rightEnd - leftStart + 1;                       // total size of the temp array
        
        int left = leftStart;
        int right = rightStart; 
        int index = leftStart;                                     // start position of temp array

        while (left <= leftEnd && right <= rightEnd){
            if(nums[left] <= nums[right]) {                     
                temp[index] = nums[left];                          // storing left element in temp array
                left++;
            }else {
                temp[index] = nums[right];                         // storing right element in temp array
                right++;
            }
            index++;
        }

        // When and If one of the pointer goes outOfBounds
        
        System.arraycopy(nums, left, temp, index,leftEnd - left + 1);       // copy remaining left side elements
        System.arraycopy(nums, right, temp, index,rightEnd - right + 1);    // copy remaining right side elements
        System.arraycopy(temp, leftStart, nums, leftStart, size);                  // copy sorted temp array into the original 'nums' array
    }

    
    // Display all the elements of the array
    public static void displayArray(int [] nums){
        int length = nums.length;
        System.out.print("[ ");
        for(int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        System.out.println();
    }
}
