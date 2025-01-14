/*
    2559. Count Vowel Strings in Ranges

    Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
    Output: [2,3,0]
    Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
    The answer to the query [0,2] is 2 (strings "aba" and "ece").
    to query [1,4] is 3 (strings "ece", "aa", "e").
    to query [1,1] is 0.
    We return [2,3,0].
 */

// Attempt 2 - Worked

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] prefix = new int [words.length];  
        int [] res = new int [queries.length];

        if(isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1))){
            prefix[0] = 1;
        }
        else{
            prefix[0] = 0;
        }
        for(int i=1; i<words.length; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                prefix[i] = prefix[i-1] + 1;
            }
            else{
                prefix[i] = prefix[i-1];
            }
        }

        for(int i=0; i<queries.length; i++){
                if(queries[i][0] == 0){
                    res[i] = prefix[queries[i][1]];
                }
                else{
                    res[i] = prefix[queries[i][1]] - prefix[(queries[i][0] - 1)];
                }
        }

        return res;  

    }

    private boolean isVowel(char ch){
        return "aeiou".indexOf(ch) >= 0;
    }
}

// Time Limit Exceeded !

/* 
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int size = queries.length;
        int [] res = new int[size];
        int temp = 0;
        int total = 0;

        for(int j=0; j<queries.length; j++){
            for(int i=queries[j][0]; i<=queries[j][1]; i++){
                if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                    total += 1;
                }
            }
            res[temp] = total;
            temp++;
            total = 0;
        }

        return res;   
    }

    private boolean isVowel(char c){
        return "aeiou".indexOf(c) >= 0;
    }
}
*/
