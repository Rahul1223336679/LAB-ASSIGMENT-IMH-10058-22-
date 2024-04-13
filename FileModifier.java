
import java.io.*;

public class FileModifier {
    // Method to append text to a file
    public static void appendToFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            System.out.println("Text appended to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to overwrite file content
    public static void overwriteFileContent(String fileName, String newText) {
        try (FileWriter writer = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(newText);
            System.out.println("Content of " + fileName + " overwritten");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to insert text at a specific position in a file
    public static void insertTextAtPosition(String fileName, int position, String text) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            file.seek(position);
            String remainingContent = file.readLine();
            file.seek(position);
            file.writeBytes(text + "\n" + remainingContent);
            System.out.println("Text inserted at position " + position + " in " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to delete content from a file
    public static void deleteContent(String fileName, String textToDelete) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = file.readLine()) != null) {
                if (!line.contains(textToDelete)) {
                    content.append(line).append("\n");
                }
            }
            file.setLength(0);
            file.writeBytes(content.toString());
            System.out.println("Content containing '" + textToDelete + "' deleted from " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to replace text in a file
    public static void replaceText(String fileName, String oldText, String newText) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             FileWriter writer = new FileWriter("temp.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(oldText, newText);
                bufferedWriter.write(line + "\n");
            }
            File originalFile = new File(fileName);
            originalFile.delete();
            File tempFile = new File("temp.txt");
            tempFile.renameTo(originalFile);
            System.out.println("Text replaced in " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String fileName = "example.txt";
        appendToFile(fileName, "New text appended to file");
        overwriteFileContent(fileName, "New content of the file");
        insertTextAtPosition(fileName, 5, "Inserted text");
        deleteContent(fileName, "text");
        replaceText(fileName, "New", "Old");
    }
}
