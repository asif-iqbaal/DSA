// iteration approach to generate Fibonacci series
// This code generates the Fibonacci series up to the nth number
// and returns it as an array.
import java.util.Arrays;

public class Fabonacci {
    public static void main(String[] args) {
        int n = 7;
        int[] result = fabonacci(n);
        System.out.println("Fibonacci series up to " + n + ": " + Arrays.toString(result));
    }
    static int[] fabonacci (int n) {
        int f1 = 0;
        int f2 = 1;

        if( n < 1) {
            return new int[] {0};
        }else if( n == 1) {
            return new int[]{0,1};
        }else {
            return generateFibonacci(n, f1, f2);
        }
    }

    static int[] generateFibonacci(int n, int f1, int f2) {
        int[] fib = new int[n];
        fib[0] = f1;
        fib[1] = f2;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        return fib;
    }
        return null;
    }
}