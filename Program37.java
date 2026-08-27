////////////////////////////////////////////////////////////////////////////////////
// Program : Given an array of integers, find and return the largest element present in the array.
//
// Example 1 :
// Input : nums = [3, 3, 6, 1]
// Output: 6
//
// Example 2 :
// Input : nums = [3, 3, 0, 99, -40]
// Output: 99
//
// Example 3 :
// Input : nums = [-4, -3, 0, 1, -8]
// Output: 1
//
// Constraints :
// 1 <= nums.length <= 10^5
// -10^4 <= nums[i] <= 10^4
// nums may contain duplicate elements.
//
// Concept : Arrays
//
// Date : 27/08/2026
//
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////

class Solution {
    public int largestElement(int[] nums) {
        int i = 0;
        int istore = nums[0];

        for(i = 1;  i< nums.length; i++ )
        {
            if(nums[i] >= istore)
            {
                istore = nums[i];
            }
        }

        return istore;

    }
}