// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class problem1 {
    class solution{
         public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
    }

    public static void main(String[] args) {
        solution sol = new problem1().new solution();
        int n = 2;
        System.out.println(sol.climbStairs(n));
    }
}