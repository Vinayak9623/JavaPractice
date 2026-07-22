package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

    static void main() {
//        addandFindByLinkedList();
//        operationOnBrowsingHistory();
//        hospitalToken();
//
//        findEmployeeThatLengthGreaterThan5();

       // productSorted();
        operationOnMarks();

    }

    public static void addandFindByLinkedList(){
        LinkedList<String> list=new LinkedList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Microservice");
        list.add(1,"sql");

        System.out.println(list);
        System.out.println("------------------------------------------------");
        list.forEach(System.out::println);

        makeUppercaseListwithJava8();
    }

    public static void operationOnBrowsingHistory(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Google.com");
        list.add("github.com");
        list.add("youtube.com");

        list.removeLast();
        System.out.println(list.getLast());
    }

    public static void hospitalToken(){
        LinkedList<String> list = new LinkedList<>();

        list.addLast("vinayak");
        list.addLast("Madhav");
        list.addLast("Guru");

        while (!list.isEmpty()){
            System.out.println("serving:"+list.removeFirst());
        }

    }

    public static void makeUppercaseList(){
        LinkedList<String> list=new LinkedList<>();
        list.add("vinayak");
        list.add("shubham");
        list.add("madhav");

        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i).toUpperCase());
        }
        list.forEach(System.out::println);
    }

    public static void makeUppercaseListwithJava8(){
        LinkedList<String> list=new LinkedList<>();
        list.add("vinayak");
        list.add("shubham");
        list.add("madhav");
        list.stream().map(String::toUpperCase).toList().forEach(System.out::println);

    }

    public static void addRecentFile(){
        List <String> list=new LinkedList<>();
        list.add("Resume.pdf");
        list.add("Notes.docx");
        list.add("Spring.pdf");
        list.add("Docker.pdf");
        System.out.println(list.getFirst());

    }

    public static void servePatientOneByOne(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Vinayak");
        list.add("Afrid");
        list.add("Madhav");
        list.add("Aman");

        while (!list.isEmpty()){
            System.out.println("Serving:"+list.removeFirst());
        }
    }

    public static void createLinkedListOfTech(){
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("c++");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void searchEmployeeUsingJava8(){

        List<String> list=List.of("vinayak","Madhav","Afriod", "Aman");
        boolean b=false;
        for(String s:list){
            if(s.equals("vinayak")) b=true;
        }
//        boolean b = list.stream().anyMatch(x -> x.equals("vinayak"));
//        System.out.println(b);
    }

    public static void findTechThatStartWithS(){
        List<String> list=List.of("Java",
                "Spring",
                "Kafka",
                "SQL",
                "Docker");
        list.stream().filter(x->x.startsWith("S")).forEach(System.out::println);
        //count tech

        long count = list.stream().count();
        System.out.println(count);


        list.stream().sorted().forEach(System.out::println);
    }

    public static void findEmployeeThatLengthGreaterThan5(){
        List<String> list=List.of("Vinayak","Madhav","Shiv","Aman","Sharda","Vidya");

        for(int i=0;i<list.size();i++){
            int size=list.get(i).length();
            if(size>5)System.out.println(list.get(i));
        }
        System.out.println("--------------------------------");

        list.stream().filter(x->x.length()>5).forEach(System.out::println);
    }

    public static void productSorted(){
        List<String> list=new ArrayList<>(List.of("Mango","pineApple","Apple","Banana"));

        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("--------------------------------");

        list.stream().sorted().forEach(System.out::println);
    }

    public static void operationOnMarks(){
        List<Integer> list = new ArrayList(List.of(2,4,5,6,9,12));

        list.stream().filter(x->x%2==0).forEach(System.out::println);
        list.stream().map(x->x*x).forEach(System.out::println);
    }

}
