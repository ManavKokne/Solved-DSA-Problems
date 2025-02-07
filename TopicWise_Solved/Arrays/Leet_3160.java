/*
    3160. Find the Number of Distinct Colors Among the Balls

    Input: limit = 4, queries = [[1,4],[2,5],[1,3],[3,4]]

    Output: [1,2,2,3]

    Explanation:

    After query 0, ball 1 has color 4.
    After query 1, ball 1 has color 4, and ball 2 has color 5.
    After query 2, ball 1 has color 3, and ball 2 has color 5.
    After query 3, ball 1 has color 3, ball 2 has color 5, and ball 3 has color 4.
*/

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap <Integer,Integer> ballMap = new HashMap<>();
        HashMap <Integer,Integer> colorMap = new HashMap<>();
        int n = queries.length;
        int res[] = new int [n];

        for(int i=0; i<n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(!ballMap.containsKey(ball)){
                ballMap.put(ball,color);
                colorMap.put(color, colorMap.getOrDefault(color,0)+1);
            }
            else{
                int oldColor = ballMap.get(ball);
                colorMap.put(oldColor, colorMap.get(oldColor)-1);
                if(colorMap.get(oldColor) == 0){
                    colorMap.remove(oldColor);
                }
                ballMap.put(ball,color);
                colorMap.put(color, colorMap.getOrDefault(color,0)+1);
            }

            res[i] = colorMap.size();
        }

        return res;
    }
}