// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

class problem2{
    class Solution2 {
   public int mySqrt(int x) {
       int l=1;
       int r=x;
       while(l<=r){
           int m=(r-l)/2+l;
           if(m>x/m) r=m-1;
           else if(m<x/m) l=m+1;
           else return m;
       }
       return r;
   }
}
    public static void main(String[] args) {
        int a = 4;
        problem2.Solution2 sol = new problem2().new Solution2();
        System.out.println(sol.mySqrt(a));
    }
}