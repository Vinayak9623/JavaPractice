package java8.file;

import java.io.*;

public class FileLearning {
    static void main() throws IOException {
        createNewFile();
        writeinFile();
        readinFile();
    }

    public static void createNewFile(){
        try {
            File file = new File("student.txt");
            if(file.createNewFile()){
                System.out.println("File has been created:"+file.getName());
            }
            else System.out.println("File already exist");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void writeinFile()throws IOException{
        FileWriter fileWriter=new FileWriter("student.txt");
        fileWriter.write("Name: Vinayak Deshmukh  \n" +
                "Course: Java  \n" +
                "Goal: Spring Boot File Handling");
        fileWriter.flush();
        fileWriter.close();
    }

    public static void readinFile()throws IOException{
        BufferedReader reader =new BufferedReader(new FileReader("student.txt"));

        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
    }
}
