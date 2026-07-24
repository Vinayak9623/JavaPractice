package list;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    static void main() {
        //mergeStudentList();
        //commonTech();
        convertListIntoUpperCase();

    }

    public static void mergeStudentList(){
        List<String> list=new ArrayList<>(List.of("vinyak","madhav","Dhananjay"));
        List<String> list1=new ArrayList<>(List.of("Avinash","Yuvraj"));
        list.addAll(list1);
        list.forEach(System.out::println);
    }

    public static void commonTech(){
        List<String> list=new ArrayList<>(List.of("Java","Microservices","Mysql"));
        List<String> list1=new ArrayList<>(List.of("Java","Microservices","Mysql","Spring","Angular"));

        list.retainAll(list1);
        list.forEach(System.out::println);

    }

    public static void convertListIntoUpperCase(){
        List<String> list=new ArrayList<>(List.of("Java","Microservices","Mysql"));
        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::println);
    }
}
