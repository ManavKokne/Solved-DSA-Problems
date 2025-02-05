/*
    1790. Check if One String Swap Can Make Strings Equal

    Input: s1 = "bank", s2 = "kanb"
    Output: true
    Explanation: For example, swap the first character with the last character of s2 to make "bank".
 */

 class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int count = 0;

        int [] idx = new int [n];

        if(s1.equals(s2)){
            return true;
        }

        for(int i=0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                idx[count] = i;
                count++;
            }
        }

        if(count != 2){
            return false;
        }

        int i = idx[0], j = idx[1];
        return (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i));
    }
}