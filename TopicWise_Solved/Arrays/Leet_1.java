/*

    1. Two Sum

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
       for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums.length; j++){
            if(nums[i] + nums[j] == target && i!=j){
                res[0] = i;
                res[1] = j;
            }
        }
       }

       return res; 
    }
}

/*
    Alternative

    class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0; i<(nums.length - 1); i++){
        for(int j=0; j<nums.length; j++){
            if(nums[i] + nums[j] == target && i!=j){
                return new int[] {i,j};
            }
        }
       }
       return null; 
        }
    }
 */