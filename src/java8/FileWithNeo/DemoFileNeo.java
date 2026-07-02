package java8.FileWithNeo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFileNeo {

    public static void main(String[] args) throws IOException {
        createFolder();
        createFileInsideFolder();
        writeInsideFile();
        readInsideFile();
        copyFiles();
        moveFile();
        readAndPrintCopiedFile();
    }

    public static void createFolder() throws IOException {

        Path path = Paths.get("uploads/nio");
        Files.createDirectories(path);
        System.out.println("Directory created using NIO");
    }

    public static void createFileInsideFolder() throws IOException {

        Path path = Paths.get("uploads/nio/data.txt");

        if (!Files.exists(path)) {
            Files.createFile(path);
            System.out.println("data.txt created");
        }
    }

    public static void writeInsideFile() throws IOException {

        Path path = Paths.get("uploads/nio/data.txt");

        Files.writeString(path,
                "This is my first NIO file.\n" +
                        "Learning modern Java.\n");
    }

    public static void readInsideFile() throws IOException {

        Path path = Paths.get("uploads/nio/data.txt");

        String content = Files.readString(path);
        System.out.println("\nOriginal File Content:\n" + content);
    }

    public static void copyFiles() throws IOException {

        Path oldPath = Paths.get("uploads/nio/data.txt");
        Path newPath = Paths.get("uploads/nio/data_copy.txt");

        Files.copy(oldPath, newPath);
        System.out.println("File copied to data_copy.txt");
    }

    public static void moveFile() throws IOException {

        // First create target folder
        Path imagesDir = Paths.get("uploads/images");
        Files.createDirectories(imagesDir);

        // Then move file
        Path oldPath = Paths.get("uploads/nio/data.txt");
        Path newPath = Paths.get("uploads/images/data.txt");

        Files.move(oldPath, newPath);
        System.out.println("Original file moved to uploads/images");
    }

    public static void readAndPrintCopiedFile() throws IOException {

        Path path = Paths.get("uploads/nio/data_copy.txt");

        String s = Files.readString(path);
        System.out.println("\nCopied File Content:\n" + s);
    }
}
