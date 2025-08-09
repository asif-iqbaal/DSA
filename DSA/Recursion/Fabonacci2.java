
import java.util.Arrays;

public  class Fabonacci2 {
    public static void main(String[] args) {
        int n = 3;
        int[] result = new int[n];
        for ( int i = 0; i < n; i++) {
            result[i]= fabonacci(i);
        }
        System.out.println("Fibonacci series up to " + n + ": " + Arrays.toString(result));

    }
    static int fabonacci(int n) {
        if(n == 0 ) return 0;
        if( n == 1) return 1;
        return fabonacci(n-1) + fabonacci(n-2);
    }
}