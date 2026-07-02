package java8.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOperation {

    static void main() {

        try {
            File file = new File("test.txt");
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }
            else System.out.println("File Already exist");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello my name is Vinayak deshmukh".getBytes(StandardCharsets.UTF_8));

            BufferedReader bufferedReader =new BufferedReader(new FileReader("test.txt"));

            String read;

            while ((read=bufferedReader.readLine())!=null){
                System.out.println(read);
            }
            bufferedReader.close();
        }

        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
