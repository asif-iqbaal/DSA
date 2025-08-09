public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array
        int result = sum(arr);
        System.out.println("Sum of array elements is: " + result);
    }
    static int sum(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            return 0;
        }else{
            return numbers[0] + sum(java.util.Arrays.copyOfRange(numbers, 1, numbers.length));
        }
    }

}