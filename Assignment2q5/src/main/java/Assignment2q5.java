public class Assignment2q5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = calculateSum(numbers);
        displayReverse(sum);
    }
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void displayReverse(int sum) {
        StringBuilder reversedSum = new StringBuilder(String.valueOf(sum)).reverse();
        System.out.println("Sum in reverse order: " + reversedSum);
    }
}
