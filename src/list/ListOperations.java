package list;

import java.util.*;

public class ListOperations {
    static void main() {
        //mergeStudentList();
        //commonTech();
        //convertListIntoUpperCase();
//        sortList();

        //operationOnListIteratorForwordAndBackword();
       // convertusingLustiterator();

        stack();

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

    public static void sortList(){
        List<String> list=new ArrayList<>(List.of("Vinayak","madhav","Avinash","Banglore"));
        list.sort(String::compareTo);
        System.out.println(list);
        list.sort((a,b)->b.compareTo(a));
        System.out.println(list);
    }

    public static void operationOnListIteratorForwordAndBackword(){
        List<String> list=new ArrayList<>(List.of("Vinayak","Madhav","Avinash","Afrid"));
        ListIterator<String> it=list.listIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }

    public static void convertusingLustiterator(){
        List<String> list=new ArrayList<>(List.of("Java","Microservices","Mysql"));

        ListIterator<String> it=list.listIterator();

        while(it.hasNext()){
            String value=it.next();
            if(value.equals("Java")){
                it.set("JAVA");
            }
        }
        System.out.println(list);

    }

    public static void stack(){
        Stack<String> stack=new Stack<>();
        stack.push("Java");
        stack.push("Spring");
        stack.push("Kafka");
        stack.push("Docker");

        System.out.println(stack.pop());//remove docker
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
