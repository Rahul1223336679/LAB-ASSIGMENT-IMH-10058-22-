import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        try {
            // Create a File object
            File file = new File(filePath);

            // Get the length of the file
            long fileSize = file.length();

            // Create a byte array to hold the file contents
            byte[] byteArray = new byte[(int) fileSize];

            // Create a FileInputStream to read the file
            FileInputStream fis = new FileInputStream(file);

            // Read the file into the byte array
            int bytesRead = fis.read(byteArray);

            // Close the FileInputStream
            fis.close();

            // Display the contents of the byte array
            System.out.println("Contents of the file as byte array:");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(byteArray[i] + " ");
            }
            System.out.println("\nBytes read: " + bytesRead);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
