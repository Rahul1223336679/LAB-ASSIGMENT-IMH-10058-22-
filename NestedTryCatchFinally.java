public class NestedTryCatchFinally {
    public static void main(String[] args) {
        try {
            try {
                // Inner try block
                int[] arr = {1, 2, 3};
                System.out.println("Inside inner try block");
                System.out.println("Array element at index 3: " + arr[3]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch block
                System.out.println("Inside inner catch block");
                System.out.println("Array index is out of bounds");
            } finally {
                // Inner finally block
                System.out.println("Inside inner finally block");
            }

            try {
                // Nested try-catch-finally block
                System.out.println("\nInside nested try-catch-finally block");
                int result = divideByZero(); // ArithmeticException
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                // Nested catch block
                System.out.println("Inside nested catch block");
                System.out.println("Cannot divide by zero");
            } finally {
                // Nested finally block
                System.out.println("Inside nested finally block");
            }
        } catch (Exception e) {
            // Outer catch block
            System.out.println("Outer catch block: " + e.getMessage());
        } finally {
            // Outer finally block
            System.out.println("Outer finally block");
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
