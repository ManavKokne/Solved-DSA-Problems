/*
    1408. String Matching in an Array

    Input: words = ["mass","as","hero","superhero"]
    Output: ["as","hero"]
    Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    ["hero","as"] is also a valid answer.
 */

 import java.util.List;
 import java.util.ArrayList;
 
 class Solution {
     public List<String> stringMatching(String[] words) {
 
         List<String> list = new ArrayList<>();
 
         for (int i = 0; i < words.length; i++) {
             for (int j = 0; j < words.length; j++) {
                 if (words[j].contains(words[i])) {
                     if (list.contains(words[i]) || words[j].equals(words[i])) {
                         continue;
                     } else {
                         list.add(words[i]);
                     }
                 }
             }
         }
 
         // Return the list
         return list;
     }
 }