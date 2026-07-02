package serlize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String surname;

    public Employee(int id,String name,String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    public static List<Employee> employeeList(){

        ArrayList<Employee> employees = new ArrayList<>(List
                .of(new Employee(1, "Vinayak", "Deshmukh")
                        , new Employee(2, "Madhav", "Deshmukh"))
        );

        return employees;
    }

    public static void createFile() throws IOException {

        File file = new File("employee.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        List<Employee> employees = employeeList();
        objectOutputStream.writeObject(employees);

        fileOutputStream.close();
        objectOutputStream.close();

        System.out.println("data store successfully");

    }

    public static void readFile() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("employee.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Employee> employees = (List<Employee>) objectInputStream.readObject();

        for(Employee e:employees){
            System.out.println(e.id+","+e.name+","+e.surname);
        }
        objectInputStream.close();
        fileInputStream.close();
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        createFile();
        readFile();
    }
}
