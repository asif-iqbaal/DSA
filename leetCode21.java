import java.util.*;

class Solution {
    private static final Map<Character, String> phoneMap = Map.of(
        '2', "abc", '3', "def",
        '4', "ghi", '5', "jkl", '6', "mno",
        '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String possibleLetters = phoneMap.get(digits.charAt(index));
        for (char ch : possibleLetters.toCharArray()) {
            current.append(ch);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}


public class leetCode21{
    public static void main(String[] args){
        Solution sol = new Solution();
        String digits = "23";
        System.out.println(sol.letterCombinations(digits));
    }
}