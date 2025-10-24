//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.


// Examples:
// Input: nums = [10, 5, 2, 7, 1, 9],  k=15

// Output: 4

// Explanation:

// The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

// Input: nums = [-3, 2, 1], k=6

// Output: 0

// Explanation:

// There is no sub-array in the array that sums to 6. Therefore, the output is 0.

// Input: nums = [-1, 1, 1], k=1



// Brute force method ---------------------------------------------------------> O(n^2)

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
    //    int[] nums = {10, 5, 2, 7, 1, 9};
    //    int k = 15 ;

    // int[] nums = {-3, 2, 1};
    // int k = 6 ;

        int[] nums = {-1, 1, 1};
        int k = 1;

        int length  = longestSubarrayBrute(nums , k );

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("The length of the longest sub-array is: " +  length);
        System.out.println("----------------------------------------------------------------------------------------");

    }

     public static int longestSubarrayBrute(int[] nums, int k) {
        int length = 0 ; 
        for (int i = 0 ; i < nums.length ; i++){
           int  sum  = 0;
           
            for (int j = i ; j < nums.length ; j++ ){
                sum = sum + nums[j];
                if (sum == k ){
                    length = j+ 1 - i  ;
                }

            }
        }
        return length;
    }
}
// Better  ----------------------------------------------------------------------------------------------------------->



