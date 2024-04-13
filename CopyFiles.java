import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String destinationFileName = "destination.txt";
        String outputFile = "output.txt";

        try (
            FileReader sourceReader = new FileReader(sourceFileName);
            FileReader destinationReader = new FileReader(destinationFileName);
            FileWriter writer = new FileWriter(outputFile);
            BufferedReader sourceBufferedReader = new BufferedReader(sourceReader);
            BufferedReader destinationBufferedReader = new BufferedReader(destinationReader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            String line;
            
            // Reading from source.txt
            System.out.println("Contents of " + sourceFileName + ":");
            while ((line = sourceBufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\n");
            }
            
            // Reading from destination.txt
            System.out.println("\nContents of " + destinationFileName + ":");
            while ((line = destinationBufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\n");
            }

            System.out.println("\nContents of both files are copied to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
