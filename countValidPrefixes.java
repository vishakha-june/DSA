class Solution {
    public int countValidPrefixes(String s) {
        int count0=0;
        int count1=0;
        int answer=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
            }else{
                count1++;
            }
            if(Math.abs(count0-count1)<=1){
                answer++;
            }
        }
        return answer;
        
    }
}




// 4006. Count Valid Prefixes
// Solved
// Easy
// premium lock icon
// Companies
// You are given a binary string s.

// A prefix of s is considered valid if its characters can be rearranged to form an alternating string.

// Return the number of valid prefixes of s.

// A binary string is a string consisting only of '0' and '1'.

// A prefix of a string is a substring that starts from the beginning of the string and extends to any point within it.

// A substring is a contiguous non-empty sequence of characters within a string.

// A string is considered alternating if no two adjacent characters are equal.

 

// Example 1:

// Input: s = "00101"

// Output: 3

// Explanation:

// The valid prefixes are:

// "0": It is already an alternating string.
// "001": It can be rearranged into "010", which is an alternating string.
// "00101": It can be rearranged into "01010", which is an alternating string.
// Thus, the answer is 3.

// Example 2:

// Input: s = "101"

// Output: 3

// Explanation:

// All prefixes of s = "101" are already alternating strings. Thus, the answer is 3.

 

// Constraints:

// 1 <= s.length <= 100
// s consists only of '0' and '1'.
