/*
    1422. Maximum Score After Splitting a String

    Input: s = "011101"
    Output: 5 
    Explanation: 
    All possible ways of splitting s into two non-empty substrings are:
    left = "0" and right = "11101", score = 1 + 4 = 5 
    left = "01" and right = "1101", score = 1 + 3 = 4 
    left = "011" and right = "101", score = 1 + 2 = 3 
    left = "0111" and right = "01", score = 1 + 1 = 2 
    left = "01110" and right = "1", score = 2 + 1 = 3

 */

 package TopicWise_Solved.Strings;


 class Solution {
    public int maxScore(String s) {
        int max = 0, count = 0, sum = 0, zeros = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        for(int i=0; i<s.length() - 1; i++){
            if(s.charAt(i) == '1'){
                count--;
            }
            else{
                zeros++;
            }
            sum = count + zeros;
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}