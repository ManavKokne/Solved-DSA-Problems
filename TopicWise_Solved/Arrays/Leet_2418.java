/*
    2418. Sort the People

    Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    Output: ["Mary","Emma","John"]
    Explanation: Mary is the tallest, followed by Emma and John.
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int currh = 0;
        String currn = "";
        int prev = 0;
        

        for(int i = 1; i<heights.length; i++){
            currh = heights[i];
            currn = names[i];
            prev = i-1;

            while(prev >= 0 && heights[prev] < currh){
                heights[prev+1] = heights[prev];
                names[prev+1] = names[prev];
                prev--;
            }

            heights[prev+1] = currh;
            names[prev+1] = currn;

        }
        return names;
    }
}