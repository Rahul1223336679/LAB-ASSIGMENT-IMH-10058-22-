import java.util.Scanner;

public class ArrayDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Result of division of each adjacent index:");

            for (int i = 0; i < size - 1; i++) {
                try {
                    double result = array[i] / (double) array[i + 1];
                    System.out.println("Index " + i + " divided by index " + (i + 1) + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero at index " + (i + 1));
                }
            }

            // Trying to access an index that is not part of the array
            try {
                int index = array.length; // Accessing index beyond array size
                System.out.println("Value at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
