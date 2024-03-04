public class Assignment2q3 {
    public static void main(String[] args) {
        System.out.println("Total number of arguments: " + getTotalArguments("Hello", 123, 3.14, true));
        System.out.println("Maximum number: " + findMaximum(5, 10, 15, 20, 25));
        System.out.println("Sum of elements: " + getSum(1, 2, 3, 4, 5));
        System.out.println("Is different types of arguments accepted? " + checkArguments(true, 123, 3.14, "Hello"));
    }
    public static int getTotalArguments(Object... args) {
        return args.length;
    }
    public static int findMaximum(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int getSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static boolean checkArguments(Object... args) {
        if (args.length == 0) {
            return false;
        }
        Class<?> type = args[0].getClass();
        for (Object arg : args) {
            if (arg.getClass() != type) {
                return false;
            }
        }
        return true;
    }
}
