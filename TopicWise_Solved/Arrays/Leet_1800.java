/*
    1800. Maximum Ascending Subarray Sum

    Input: nums = [10,20,30,5,10,50]
    Output: 65
    Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 */

class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int max = Integer.MIN_VALUE; //i

        if(n == 0){
            return 0;
        }

        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                sum += nums[i];
            }
            else{
                max = Math.max(max , sum);
                sum = nums[i];
            }
        }
        max = Math.max(max , sum);
        return max;
    }
}