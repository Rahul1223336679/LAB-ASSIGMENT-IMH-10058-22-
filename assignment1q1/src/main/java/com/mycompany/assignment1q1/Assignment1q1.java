import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array (you can modify this array or take input from the user as in the previous example)
        int[] array = {10, 20, 30, 40, 50};

        // Ask user for the element to search
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                index = i;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element " + element + " found at index " + index);
        } else {
            System.out.println("Element " + element + " not found in the array");
        }

        // Close the scanner
        scanner.close();
    }
}
