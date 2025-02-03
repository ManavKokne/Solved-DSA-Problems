/*
    3105. Longest Strictly Increasing or Strictly Decreasing Subarray

    Input: nums = [1,4,3,3,2]

    Output: 2

    Explanation:

    The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

    The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

    Hence, we return 2.
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; 

        int countInc = 1, countDec = 1, max = 1; 
        
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                countInc++;
            } else {
                countInc = 1; 
            }
            
            if (nums[i] < nums[i - 1]) {
                countDec++;
            } else {
                countDec = 1; 
            }
            
            max = Math.max(max, Math.max(countInc, countDec));
        }
        
        return max;
    }
}
