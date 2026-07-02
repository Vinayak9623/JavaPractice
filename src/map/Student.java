package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private String department;


    public Student(String name,String department){
        this.name=name;
        this.department=department;
    }

    static void main() {

    }

//    public static void groupStudentByDepartMent(){
//
//        List<Student> list = List.of(new Student("Vinayak", "IT"), new Student("shubham", "IT"),
//                new Student("Guru", "CS"), (new Student("Afrid", "IT")
//                , new Student("Santosh", "CA"));
//
//        HashMap<String,List<String>> map =new HashMap<>();
//
//        list.stream().collect(Collectors.groupingBy(x->x.department,HashMap::new));
//
//    }
}
