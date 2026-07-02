package java8.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    static void main(String args[]) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("this is my first file that I have created");
            fileWriter.write("I am vinayak Shivajirao Deshmukh");
            fileWriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        readFile();
    }

    public static void readFile(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String read;
            while ((read=reader.readLine())!=null){
                System.out.println(read);
            }
           reader.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
