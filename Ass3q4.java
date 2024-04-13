import java.util.Scanner;

public class Ass3q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = convertToLowerCase(inputString);
        System.out.println("String in lowercase: " + lowercaseString);

        // Display the total string length
        displayStringLength(inputString);

        scanner.close();
    }

    // Method to convert the string to lowercase
    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    // Method to display the total string length
    public static void displayStringLength(String str) {
        System.out.println("Total string length: " + str.length());
    }
}
