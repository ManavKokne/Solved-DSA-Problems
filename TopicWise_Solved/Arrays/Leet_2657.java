/*
    2657. Find the Prefix Common Array of Two Arrays

    // ! A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.

    Input: A = [1,3,2,4], B = [3,1,2,4]
    Output: [0,2,3,4]
    Explanation: At i = 0: no number is common, so C[0] = 0.
    At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
    At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
    At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.

 */

 //My attempt : 

 /* 
 class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int [] res = new int [n];
        int [] freq = new int [n];
        int count = 0;

        for(int i=0; i<n; i++){
            count = 0;
            freq[A[i]-1] += 1;
            freq[B[i]-1] += 1;

            for(int j=0; j<n; j++){
                if(freq[j] == 2){
                    count++;
                }
            }

            res[i] = count;
        }

        return res;
    }
}
*/