/*
    13. Roman to Integer

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
 */

class Solution {

    private int getValue(char ch){
            switch(ch){
                case 'I':
                return 1;
                case 'V':
                return 5;
                case 'X':
                return 10;
                case 'L':
                return 50;
                case 'C':
                return 100;
                case 'D':
                return 500;
                case 'M':
                return 1000;
                default: return 0;
            }
        }

    public int romanToInt(String s) {
        
        int total = 0;
        int value = 0;
        for(int i=0; i<s.length(); i++){
            value = getValue(s.charAt(i));

            if(i < s.length() - 1 && value < getValue(s.charAt(i+1))){
                total = total - value;
            }
            else{
                total = total + value;
            }
        }
        return total;
    }
}