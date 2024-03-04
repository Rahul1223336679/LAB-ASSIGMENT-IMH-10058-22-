import java.util.Scanner;
public class Assignment2q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] input = {scanner.nextLine()};
        String lowercaseString = convertToLowercase(input);
        System.out.println("String in lowercase: " + lowercaseString);
        int totalLength = getTotalStringLength(input);
        System.out.println("Total string length: " + totalLength);
    }
    public static String convertToLowercase(String... strings) {
        return strings[0].toLowerCase();
    }
    public static int getTotalStringLength(String... strings) {
        return strings[0].length();
    }
}
