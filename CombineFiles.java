import java.io.*;

public class CombineFiles {
    public static void main(String[] args) {
        String file1Name = "file1.txt";
        String file2Name = "file2.txt";
        String combinedFileName = "combined.txt";

        try (
            FileInputStream file1Stream = new FileInputStream(file1Name);
            FileInputStream file2Stream = new FileInputStream(file2Name);
            SequenceInputStream sequenceInputStream = new SequenceInputStream(file1Stream, file2Stream);
            BufferedReader reader = new BufferedReader(new InputStreamReader(sequenceInputStream));
        ) {
            FileWriter writer = new FileWriter(combinedFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            String line;
            System.out.println("Contents of the combined file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\n");
            }

            bufferedWriter.close();
            System.out.println("\nCombined file created: " + combinedFileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
