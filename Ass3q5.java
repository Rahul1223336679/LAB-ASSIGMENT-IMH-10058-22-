public class Ass3q5 {
    public static void main(String[] args) {
        // Anonymous array of integers
        int sum = findSum(new int[]{10, 20, 30, 40, 50});

        // Display the sum in reverse order
        displayInReverse(sum);
    }

    // Method to find the sum of values in an anonymous array
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to display the sum in reverse order
    public static void displayInReverse(int num) {
        String numString = String.valueOf(num);
        for (int i = numString.length() - 1; i >= 0; i--) {
            System.out.print(numString.charAt(i));
        }
        System.out.println();
    }
}
