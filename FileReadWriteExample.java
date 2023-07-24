import java.io.*;

public class FileReadWriteExample {
    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String fileName = "sample_file.txt";
        String contentToWrite = "Hello, this is the content written to the file!";

        // Write content to the file
        writeToFile(fileName, contentToWrite);

        // Read content from the file and display on the console
        String contentRead = readFromFile(fileName);
        System.out.println("Content read from the file:");
        System.out.println(contentRead);
    }
}
