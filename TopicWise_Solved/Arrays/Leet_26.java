/*
    26. Remove Duplicates from Sorted Array

    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).   
 */

class Solution {
    public int removeDuplicates(int[] nums) { 
        int ptr = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[ptr]){
                ptr++;
                nums[ptr] = nums[i];
            }
        }
        return (ptr+1);
    }
}