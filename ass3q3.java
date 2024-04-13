public class ass3q3 {
    public static void main(String[] args) {
        // Task a: Display the total number of arguments
        displayTotalArguments(10, 20, 30);
        displayTotalArguments("Hello", "World", "Java", "Programming");

        // Task b: Calculate the maximum of numbers in a given list of elements
        int maxNum = findMax(5, 10, 3, 8, 15);
        System.out.println("Maximum number: " + maxNum);

        // Task c: Calculate the sum of all the elements in the list
        int sum = findSum(2, 4, 6, 8, 10);
        System.out.println("Sum of elements: " + sum);

        // Task d: Check if variable-length arguments can accept different types of arguments
        printArguments("Java", 10, true);
    }

    // Task a: Method to display the total number of arguments
    public static void displayTotalArguments(Object... args) {
        System.out.println("Total number of arguments: " + args.length);
    }

    // Task b: Method to find the maximum of numbers in a given list of elements
    public static int findMax(int... nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task c: Method to calculate the sum of all the elements in the list
    public static int findSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Task d: Method to print variable-length arguments of different types
    public static void printArguments(Object... args) {
        System.out.println("Arguments:");
        for (Object arg : args) {
            System.out.println(arg);
        }
    }
}
