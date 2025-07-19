// Given two binary strings a and b, return their sum as a binary string.
class Solution67{
     public String addBinary(String a, String b) {
       StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while( i>=0 || j >=0 || carry==1){
            int sum = carry;

            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';

            result.append(sum%2);
            carry = sum/2;
        }
        return  result.reverse().toString();
    }
}

public class leetCode67{
     public static void main(String[] args){
        Solution67 s = new Solution67();
        String a = "11";
        String b = "1";
        System.out.println(s.addBinary(a, b));
    }
}