

// Q1. Process String with Special Operations I
// Medium
// 4 pt.
// You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

// Build a new string result by processing s according to the following rules from left to right:

// If the letter is a lowercase English letter append it to result.
// A '*' removes the last character from result, if it exists.
// A '#' duplicates the current result and appends it to itself.
// A '%' reverses the current result.
// Return the final string result after processing all characters in s.

class Solution22 {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(c);
            } else if (c == '*') {
                if (result.length() > 0)
                    result.deleteCharAt(result.length() - 1);
            } else if (c == '#') {
                result.append(result.toString());
            } else if (c == '%') {
                result.reverse();
            }
        }

        return result.toString();
    }
}

public class leetCode22 {
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        
        
        System.out.println(sol.processStr("abc*#"));    
        System.out.println(sol.processStr("a%b"));      
        System.out.println(sol.processStr("ab*cd#%"));  
    }
}
