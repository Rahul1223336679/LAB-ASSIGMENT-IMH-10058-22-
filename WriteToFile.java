import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the filename to write to
        System.out.print("Enter the name of the file to write to: ");
        String outputFile = scanner.nextLine();

        // Get the number of lines to write
        System.out.print("Enter the number of lines to write: ");
        int numLines = Integer.parseInt(scanner.nextLine());

        try {
            // Open the file for writing
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Loop to read each line from the user input and write it to the file
            for (int i = 0; i < numLines; i++) {
                System.out.print("Enter line " + (i + 1) + ": ");
                String line = scanner.nextLine();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // Close the writer
            bufferedWriter.close();
            System.out.println("Lines have been written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
