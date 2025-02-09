/*
    2364. Count Number of Bad Pairs

    Input: nums = [4,1,3,3]
    Output: 5
    Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
    The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
    The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
    The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
    The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
    There are a total of 5 bad pairs, so we return 5.   
 */

// Using HashMap

class Solution {
    public long countBadPairs(int[] nums) {
        int n= nums.length;
        long total = (long) n * (n - 1) / 2;
        long good = 0;

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int key = nums[i]-i;

            good += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }

        return total-good;
    }
}

// Attempt 1 : Nested Loop => Exceeds Time Limit

// class Solution {
//     public long countBadPairs(int[] nums) {
//         int n=nums.length;
//         long count=0; 
        
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if((j-i) != nums[j]-nums[i]){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }