import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int intCount = scanner.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < intCount; i++) {
            intList.add(scanner.nextInt());
        }

        // Add few elements to the ArrayList of integers
        intList.add(0, 100); // Insert at first position
        intList.add(200);
        intList.add(300);

        // Print the ArrayList of integers
        System.out.println("ArrayList of integers:");
        System.out.println(intList);

        // Remove specific element from the ArrayList of integers
        intList.remove(Integer.valueOf(200)); // Remove element 200

        // Sort the ArrayList of integers
        Collections.sort(intList);

        // Print the sorted ArrayList of integers
        System.out.println("\nSorted ArrayList of integers:");
        System.out.println(intList);

        // ArrayList of strings
        ArrayList<String> strList = new ArrayList<>();
        System.out.print("\nEnter the number of strings: ");
        int strCount = scanner.nextInt();
        System.out.println("Enter the strings:");
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < strCount; i++) {
            strList.add(scanner.nextLine());
        }

        // Add few elements to the ArrayList of strings
        strList.add(0, "Hello"); // Insert at first position
        strList.add("World");

        // Print the ArrayList of strings
        System.out.println("\nArrayList of strings:");
        System.out.println(strList);

        // Remove specific element from the ArrayList of strings
        strList.remove("World"); // Remove element "World"

        // Sort the ArrayList of strings
        Collections.sort(strList);

        // Print the sorted ArrayList of strings
        System.out.println("\nSorted ArrayList of strings:");
        System.out.println(strList);

        scanner.close();
    }
}

