import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string without using built-in functions
        String reversed = reverseString(input);

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    // Method to reverse a string without using built-in functions
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize indices for swapping
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the character array
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the reversed character array back to a string
        return new String(charArray);
    }
}
