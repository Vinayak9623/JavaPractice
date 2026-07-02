package serlize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;


    public Student(){}
    public Student(int id, String name,String surname){

        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    public List<Student> studentList(){
        ArrayList<Student> students = new ArrayList<>(List
                .of(new Student(1, "Vinayak", "Deshmukh"),
                        new Student(2, "Madhav", "Deshmukh")));
        return students;
    }

    public  void storeInFile() throws IOException {
        File file =new File("student.txt");

        Student student=new Student();
        List<Student> students = student.studentList();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for(Student s:students){
            bufferedWriter.write(s.id+","+s.name+","+s.surname);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Data store successfully");

    }

    public static void main(String args[]) throws IOException {
        Student student = new Student();
        student.storeInFile();
    }
}
