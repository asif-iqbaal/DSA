
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String input = sc.nextLine();
        String result = palindrome(input);
        
        if(input.equals(result)){
            System.out.println(" yes , palindrom");
        }else{
            System.out.println("no , not a palindrom");
        }
        sc.close();
    }
    
    static String palindrome(String s){
        if(s.isEmpty()){
            return "";
        }else if(s.length() == 1){
            return s;
        }else{
            return s.charAt(s.length() - 1) + palindrome(s.substring(0,s.length()-1));
        }
    }
}