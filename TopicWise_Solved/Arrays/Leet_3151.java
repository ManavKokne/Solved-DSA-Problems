/*
    3151. Special Array I

    Example 2:

    Input: nums = [2,1,4]

    Output: true

    Explanation:

    There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.

    Example 3:

    Input: nums = [4,3,1,6]

    Output: false

    Explanation:

    nums[1] and nums[2] are both odd. So the answer is false.
    
 */



class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;

        // if(n == 1){return true;}

        for(int i=0; i<n-1; i++){
            if(nums[i]%2 == nums[i+1]%2){
                return false;
            }
        }
        return true;
    }
}