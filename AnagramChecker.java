import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all non-alphanumeric characters and convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "");

        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
