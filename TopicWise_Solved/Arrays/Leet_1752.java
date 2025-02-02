/*
    1752. Check if Array Is Sorted and Rotated

    Input: nums = [3,4,5,1,2]
    Output: true
    Explanation: [1,2,3,4,5] is the original sorted array.
    You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].    
 */

class Solution {
    public boolean check(int[] nums) {
    //    A[i] == B[(i+x) % A.length] 
    int n = nums.length;
    int count = 0;

    for(int i=0; i<n; i++){
        if(nums[i] > nums[(i+1)%n]){
            count++;
        }
    }

    return (count <= 1)?true:false;
    }
}

// class Solution {
//     public boolean check(int[] nums) {
 
//     int n = nums.length;

//     for(int i=0; i<n-2; i++){
//         if(nums[i] == nums[i+1]-1){
//             continue;
//         }
//         else{
//             if(nums[i+1] != nums[i+2]-1){
//                 return false;
//             }
//         }
//     }

//     return true;
//     }
// }