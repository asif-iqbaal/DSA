import java.util.*;

public class Reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        // String str = "Hello, World!"; // Example string
        // String result =  reverse(str);
        // System.out.println("Reversed string is: " + result);
    }
    static String reverse(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }else{
            return str.charAt(str.length() -1) + reverse(str.substring(0, str.length() -1));
        }
    }
}