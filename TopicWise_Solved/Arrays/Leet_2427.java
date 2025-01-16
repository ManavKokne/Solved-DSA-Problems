/*
    2427. Number of Common Factors

    Input: a = 12, b = 6
    Output: 4
    Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
 */

class Solution {
    public int commonFactors(int a, int b) {
        int common = 0;
        int lar = a>b?a:b;

        for(int i=1; i<=lar; i++){
            if(a%i == 0 && b%i == 0){
                common++;
            }
        }

        return common;
    }
}