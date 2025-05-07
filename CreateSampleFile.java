import java.io.FileWriter;
import java.io.IOException;

public class CreateSampleFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String content = "I'm Shami Ahmad.\n"
                       + "Data structure and Algorithms.\n"
                       + "Java will read and print these lines.";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("sample.txt created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
