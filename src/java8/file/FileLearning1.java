package java8.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLearning1 {

    public static void main(String args[]) throws IOException{

        fileExist();

    }

    public static void fileExist(){

        try {
            File file = new File("student.txt");
            if (file.exists()) {
                System.out.println(file.getAbsolutePath());
            }
            file.delete();

            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));

            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
