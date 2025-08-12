
import java.util.Scanner;

public class binarycount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number \n");
        int input = sc.nextInt();
        String binary = Integer.toBinaryString(input);
        int Number_of_one = count(binary);
        System.out.println(binary);
        System.out.println(Number_of_one);
        sc.close();
    }

    static int count(String n) {
        if (n.isEmpty()) {
            return 0;
        } else {
            return (n.charAt(n.length() - 1) == '1' ? 1 : 0)
                    + count(n.substring(0, n.length() - 1));
        }
    }
}
