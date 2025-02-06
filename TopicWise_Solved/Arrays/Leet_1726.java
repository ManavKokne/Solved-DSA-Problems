/*
    1726. Tuple with Same Product

    Input: nums = [2,3,4,6]
    Output: 8
    Explanation: There are 8 valid tuples:
    (2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
    (3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
 */

 class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int res = nums[i] * nums[j];
                map.put(res, map.getOrDefault(res,0)+1);
            }
        }
        
        int ans = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int product = entry.getKey();
            int count = entry.getValue();
            if(count >= 2){
                ans += ((count * (count-1))/2)*8;
            }
        }

        return ans;
    }
}