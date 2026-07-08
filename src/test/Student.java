package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static List<Student> list=new ArrayList<>();

    public static List<Student> add() {
        list.add(new Student(1, "Vinayak", "IT"));
        list.add(new Student(2,"Aman","IT"));
        list.add(new Student(3,"Rahul","Sales"));
        list.add(new Student(4,"Shankar","Developer"));

        return list;
    }

    public static void findStudentByDepartment() {
        Map<String, List<Student>> collect = list.stream()
                .collect(
                        Collectors.groupingBy(
                                x -> x.department,
                                LinkedHashMap::new,
                                Collectors.toList()
                        )
                );

        System.out.println(collect);
    }

    static void main() {
        add();
        findStudentByDepartment();
    }


}
