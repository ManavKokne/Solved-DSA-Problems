/*
    2185. Counting Words With a Given Prefix

    Input: words = ["pay","attention","practice","attend"], pref = "at"
    Output: 2
    Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
    
 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                res++;
            }
        }
        return res;
    }
}