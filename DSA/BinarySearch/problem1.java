// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of
// a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

import java.util.*;

public class problem1 {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j;
        int first = -1, last = -1;
        for (i = 0; i < nums.length; i++) {
        if (nums[i] == target){
              first = i; 
        break;
        }
          
        }
        for (j = nums.length - 1; j>=0; j--) {
            if (nums[j] == target){
                 last = j;
            break;
            }
               
        }
        return new int[]{first, last};
    }

    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solution sol = new problem1().new Solution();
        System.out.println(Arrays.toString(sol.searchRange(nums, target)));
    }
}