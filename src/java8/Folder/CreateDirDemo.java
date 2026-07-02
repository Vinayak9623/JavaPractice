package java8.Folder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDirDemo {

    public static void main(String[] args) {
        createFolders();
        createFileInsideFolder();
        moveFile();
        listAllFiles();
    }

    public static void createFolders() {

        File uploads = new File("uploads");
        File images = new File("uploads/images");
        File docs = new File("uploads/docs");

        uploads.mkdir();
        images.mkdirs();
        docs.mkdirs();

        System.out.println("Folders created successfully!");
    }

    public static void createFileInsideFolder() {

        File file = new File("uploads/docs/notes.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("notes.txt created inside uploads/docs");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(
                    "Learning Java File Handling\n" +
                            "Preparing for Spring Boot\n"
            );
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile() {

        File oldFile = new File("uploads/docs/notes.txt");
        File newFile = new File("uploads/images/notes.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File moved successfully!");
        } else {
            System.out.println("File move failed!");
        }
    }

    public static void listAllFiles() {

        File dir = new File("uploads/images");

        if (dir.exists() && dir.isDirectory()) {

            String[] files = dir.list();

            System.out.println("\nFiles inside uploads/images:");

            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
