package java8.file;

import java.io.File;

public class CreateDirectoryDemo {
    public static void main(String args[]){

        createFolder();
        createNestedFolders();
        createNewFile();
        moveFile();
        renameFile();

    }

    public static void createFolder(){
        File file=new File("upload");
        if(file.mkdir()){
            System.out.println("folder created successfully");
        }
        else System.out.println("Folder alredy exist");
    }

    public static void createNestedFolders(){
        File file =new File("upload/images/photos");
        if(file.mkdirs()){
            System.out.println("Nested Folders has been created");
        }
    }
 public static void createNewFile(){

        File dir=new File("upload");

        if(dir.exists() && dir.isDirectory()){
            String[] files= dir.list();

            System.out.println("files Inside the Upload folders");

            for(String file:files){
                System.out.println(file);
            }
        }
        else System.out.println("Directory doesn't exist");
    }

    public static void moveFile(){

        File oldFile = new File("one.txt");
        File newFile = new File("upload/one.txt");

        if(oldFile.renameTo(newFile)){
            System.out.println("file move successfully");
            newFile.getAbsolutePath();
        }
        else System.out.println("File move failed");
    }

    public static void renameFile(){

        File file = new File("upload/one.txt");
        File newFile=new File("upload/learn.txt");

        if(file.renameTo(newFile)){
            System.out.println("File rename successfully");
        }
        else System.out.println("File rename failed");
    }
}