/*
    2270. Number of Ways to Split Array

    Input: nums = [10,4,-8,7]
    Output: 2
    Explanation: 
    There are three ways of splitting nums into two non-empty parts:
    - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
    - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
    - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
    Thus, the number of valid splits in nums is 2.
 */

class Solution {
    public int waysToSplitArray(int[] nums) {
        long [] prefix = new long[nums.length];
        int res = 0;

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i=0; i<(nums.length-1); i++){
            long left = prefix[i];
            long right = prefix[nums.length-1] - prefix[i];

            if(left >= right){
                res++;
            }
        }

        return res;
    }
}

