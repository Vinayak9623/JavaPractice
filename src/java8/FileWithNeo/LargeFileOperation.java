package java8.FileWithNeo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeFileOperation {

    public static void main(String[] args) throws Exception {

        createAndWriteLargeFile();
        readLineByLineLargeFile();
        copyImageWithStreaming();
    }

    // -------- TASK A: TEXT FILE --------
    public static void createAndWriteLargeFile() throws IOException {

        Path path = Paths.get("uploads/large.txt");

        // Write sample lines first
        String content =
                "Line 1\nLine 2\nLine 3\nLine 4\nLine 5\n" +
                        "Line 6\nLine 7\nLine 8\nLine 9\nLine 10\n";

        Files.writeString(path, content);

        System.out.println("large.txt created and filled with data.");
    }

    public static void readLineByLineLargeFile() throws IOException {

        Path path = Paths.get("uploads/large.txt");

        System.out.println("\nReading file line-by-line:\n");

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                try {
                    Thread.sleep(500); // simulate slow processing
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    // -------- TASK B: BINARY STREAMING (CORRECT WAY) --------
    public static void copyImageWithStreaming() throws IOException {

        Path source = Paths.get(
                "C:\\Users\\Umesh Salappa\\Documents\\file_example_JPG_100kB.jpg"
        );
        Path target = Paths.get("uploads/photo_copy.jpg");

        try (InputStream in = Files.newInputStream(source);
             OutputStream out = Files.newOutputStream(target)) {

            byte[] buffer = new byte[1024]; // 1KB chunk
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("\nImage copied safely using streaming!");
    }
}
